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
            if(A[i] == 0){
                zero = 0;
                break;
            }
        }
        try{
        if(zero == 0){
            ans = 0;
        }else{for(int i = 0; i < N ; i++){
            ans = Math.multiplyExact(ans, A[i]);
                if(ans > 1000000000000000000L){
                    ans = -1;
                    break;
                }
            }
        }
        }catch(ArithmeticException e){
            ans = -1;
        }
        System.out.println(ans);
        
        
    }    
}