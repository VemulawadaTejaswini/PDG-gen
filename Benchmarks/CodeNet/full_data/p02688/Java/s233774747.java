import java.util.Scanner;
public class Main {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int d;
        int ans = 0;
        
        int[] C = new int[(int) N];
        for(int i = 0; i < N ; i++){
            C[i] = 1;
        }
        for(int n = 0; n < K ; n++){
            d = sc.nextInt();
            int[] A = new int[(int)d];
                for(int i = 0 ; i < d ; i++){
                    A[i] = sc.nextInt();
                    C[A[i] - 1] = 0;
                    
                }
        }
        
        for(int i = 0; i < N ;i++){
            ans = ans + C[i];
        }        
        System.out.println(ans);
    
    }
}