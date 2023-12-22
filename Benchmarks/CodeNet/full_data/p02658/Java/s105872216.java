import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N];
        long ans = 1;
        int zero = 2;
        
        for(int i = 0; i < N ; i++){
            A[i] = sc.nextLong();
            ans = ans * A[i];
            if(A[i] == 0){
                zero = 0;
            }
        }
        
        if(ans > 1000000000000000000L){
                ans = -1;
        }
        
        if(zero == 0){
            ans = 0;
        }
        
        System.out.print(ans);
        
        
    }    
}
