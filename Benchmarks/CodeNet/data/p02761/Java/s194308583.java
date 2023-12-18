import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] S = new int[M];
        int[] C = new int[M];
        int[] result = new int[N];
        for(int i = 0; i < N; i++) result[i] = 100;
        for(int i = 0; i < M; i++) {
            S[i] = Integer.parseInt(sc.next());
            C[i] = Integer.parseInt(sc.next());
            if(S[i] == 1 && C[i] == 0 && N != 1) {
                System.out.println(-1);
                return ;
            }
        }

        for(int i = 0; i < M; i++) {
            if(result[S[i] -1] != 100 && result[S[i] - 1] != C[i]) {
                System.out.println(-1);
                return;
            }
            result[S[i] - 1] = C[i];
        }
        String numStr = "";
        if(result[0] == 100) result[0] = 1;
        numStr += Integer.toString(result[0]);
        for(int i = 1; i < N; i++) {
            if(result[i] == 100) result[i] = 0;
            numStr += Integer.toString(result[i]);
        }

        System.out.println(numStr);
    }
}