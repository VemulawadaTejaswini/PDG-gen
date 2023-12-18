import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arraymax = 1000005;
        int[] X = new int[M]; 
        int[] gap = new int[arraymax];
        int gapMax = 0; 
        int ans = 0;
        
        for(int i = 0; i < M; i++){
            X[i] = sc.nextInt();
        }
        Arrays.sort(X);

        for(int i = 0; i < 1000005; i++){
            gap[i] = 0; 
        }
        for(int i = 0; i < M-1; i++){
            gap[i] = X[i+1] - X[i]; 
        }
        Arrays.sort(gap);

        for(int i = 0; i < N-1; i++){
            gap[(arraymax - 1) - i] = 0;
        }

        for(int i = 0; i < arraymax; i++){
            ans += gap[i];
        }

        System.out.print(ans);
    }
}
