import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] result = new int[N];
        int[] count = new int[N];
        for(int i = 0; i < N; i++) {
        	result[i] = 100;
        	count[i] = 100;
        }
        int[] S = new int[M];
        int[] C = new int[M];
        for(int i = 0; i < M; i++) {
            S[i] = Integer.parseInt(sc.next());
            C[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < M; i++) {
        	count[S[i] - 1] = C[i];
        	if(count[S[i] - 1] != 100 && count[S[i] - 1] != C[i]) {
        		System.out.println(-1);
        		return;
        	}
        }
        for(int i = 0; i < M; i++) {
            if(!(S[i] == 1 && C[i] == 0)) {
                result[S[i] - 1] = Math.min(C[i], result[S[i] - 1]);
            }

        }
        if(result[0] == 0 || result[0] == 100 && !(N == 1)) {
            System.out.println(-1);
            return;
        }
        String numStr = "";
        for(int i = 0; i < N; i++) {
            if(result[i] == 100) result[i] = 0;
            numStr += Integer.toString(result[i]);
        }
        System.out.println(numStr);
    }
}
