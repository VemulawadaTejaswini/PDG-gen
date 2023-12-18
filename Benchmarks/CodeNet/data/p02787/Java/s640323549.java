
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    public static class Pair {
        int A;
        int B;
        public Pair(int a, int b){
            A = a;
            B = b;
        }
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int H = scan.nextInt();
        int N = scan.nextInt();
        Pair[] pairs = new Pair[N];
        for(int i = 0; i < N; i++){
            pairs[i] = new Pair(scan.nextInt(), scan.nextInt());
        }

        Arrays.sort(pairs, (p1, p2) -> p1.A - p2.A);

        int costs[] = new int[H+1];
        for(int j = 0; j < H+1; j++){
            int A = pairs[0].A;
            int B = pairs[0].B;
            int power = j + A;
            int cost = costs[j] + B;
            if(power >= H)
                power = H;
            if(j != 0 && costs[j] == 0) continue;;
            costs[power] = cost;
            if(power >= H) {
                costs[H] = cost;
                break;
            }
        }

        for(int i = 1; i <N; i++) {
            int A = pairs[i].A;
            int B = pairs[i].B;
            for(int j = 0; j < H+1; j++){
                int power = j + A;
                int cost = costs[j] + B;
                if(power >= H)
                    power = H;
                if(j != 0 && costs[power] == 0) continue;
                if(cost < costs[power])
                    costs[power] = cost;
            }
        }

        os.println(costs[H]);
    }

}