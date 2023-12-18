import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] A = new long[N];
        for(int i = 0; i < N; i++) A[i] = sc.nextLong();
        
        long[] B = new long[M];
        long[] C = new long[M];
        for(int i = 0; i < M; i++){
            B[i] = sc.nextLong();
            C[i] = sc.nextLong();
        }
        
        boolean flag = false;
        for(int i = 0; i < M; i++){
            Arrays.sort(A);            
            
            long Cmax = 0; 
            int memo = 0;
            //最大のC[j]とキーjを確保
            for(int j = 0; j < M; j++){
                if(Cmax <= C[j]){
                    Cmax = C[j];
                    memo = j;
                }
            }
            for(int j = 0; j < B[memo]; j++){
                if(A[j] < Cmax){
                    A[j] = Cmax;
                }else{
                    flag = true;
                    break;
                }
            }
            
            C[memo] = 0;
            if(flag){
                break;
            }
        }
        long ans = 0;
        for(int i = 0; i < N; i++)ans += A[i];
        System.out.println(ans);
    }
}