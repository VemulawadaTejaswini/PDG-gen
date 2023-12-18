
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        long H[] = new long[N];

        for(int i = 0; i < N; i++)
            H[i] = scan.nextLong();

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++)
            set.add(i);

        for(int i = 0; i < M; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;

            if(H[a] < H[b])
                set.remove(a);
            else if(H[a] > H[b])
                set.remove(b);
            else if(H[a] == H[b]) {
                set.remove(a);
                set.remove(b);
            }
        }

        os.println(set.size());
    }


}