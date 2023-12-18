import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        int[] p = new int[Q];
        int[] q = new int[Q];
        int[] count = new int[Q];
        for(int i = 0; i < M; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        for(int i = 0; i < Q; i++){
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }
        for(int i = 0; i < Q; i++){
            for(int j = 0; j < M; j++){
                if(L[j] >= p[i] && R[j] <= q[i]){
                    count[i] ++;
                }
            }
        }
        for(int i = 0; i < Q; i++){
            System.out.println(count[i]);
        }
    }
}
