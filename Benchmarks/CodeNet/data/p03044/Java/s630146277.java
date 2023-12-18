import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] input = line.split(" ", 0);
        int N = Integer.valueOf(input[0]).intValue();
        int[] result = new int[N];

        while(sc.hasNextLine()) {
            line = sc.nextLine();
            input = line.split(" ", 0);

            int u = Integer.valueOf(input[0]).intValue();
            int v = Integer.valueOf(input[1]).intValue();
            int w = Integer.valueOf(input[2]).intValue();
            if(w%2 == 1){
                if(result[u-1] == result[v-1]){
                    result[v-1] = 1;
                }
            }
        }
        for(int i = 0; i<N; i++){
            System.out.println(result[i]);
        }

    }
}