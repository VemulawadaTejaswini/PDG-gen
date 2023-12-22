import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N];
        long ans = 1;
        
        for(int i = 0; i < N ; i++){
            A[i] = sc.nextLong();
            ans = ans * A[i];
        }
        
        if(ans > 1000000000000000000L){
                ans = -1;
        }
        
        System.out.print(ans);
        
        
    }    
}