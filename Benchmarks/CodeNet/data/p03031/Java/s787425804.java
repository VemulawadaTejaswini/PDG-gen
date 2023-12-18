import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] k = new int[M];
        int[][] s = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                s[i][j] = 0;
            }
        }
        for(int i = 0; i < M; i++){
            k[i] = sc.nextInt();
            for(int j = 0; j < k[i]; j++){
                int on = sc.nextInt();
                s[i][on-1] = 1;
            }
        }
        
        int[] p = new int[M];
        for(int i = 0; i < M; i++) p[i] = sc.nextInt();
        
        int ans = 0;
        for(int i = 0; i<(1<<N); i++){

            boolean allOn = true;
            for(int j = 0; j < M; j++){
                int match = 0;
                for(int l = 0; l < N; l++){
                    if(((1 & i>>l) == s[j][l])){
                        match++;
                    }
                }
                if(!(match % 2 == p[j])){
                    allOn = false;
                    break;
                }
            }
            if(allOn) ans++;
        }
        System.out.println(ans / 2);
    }
}
