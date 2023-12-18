import java.util.*;

public class Main{
    static int[][] D;
    static int min = Integer.MAX_VALUE;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        int[] r = new int[R];
        for(int i = 0; i < R; i++)
            r[i] = sc.nextInt();
        String rr = "";
        for(int i = 0; i < R; i++){
            rr += (char)r[i];
        }
        D = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i != j)
                    D[i][j] = 1000000000;
            }
        }
        int[][] A = new int[3][M];
        for(int i = 0; i < M; i++){
            A[0][i] = sc.nextInt();
            A[1][i] = sc.nextInt();
            A[2][i] = sc.nextInt();
            D[A[0][i]-1][A[1][i]-1] = A[2][i];
            D[A[1][i]-1][A[0][i]-1] = A[2][i];
        }
        sc.close();
        for(int k = 0; k < N; k++){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    D[i][j] = Math.min(D[i][j], D[i][k]+D[k][j]);
                }
            }
        }

        permutation(rr, "");
        System.out.println(min);
        
    }
    public static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
            String s = ans + q;
            int tmp = 0;
            for(int i = 0; i < s.length()-1; i++){
                tmp += D[(int)s.charAt(i)-1][(int)s.charAt(i+1)-1];
            }
            min = Math.min(min, tmp); 
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i));
            }
        }
    }
}