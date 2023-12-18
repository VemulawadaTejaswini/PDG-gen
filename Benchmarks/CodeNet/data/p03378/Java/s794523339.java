import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int A[] =new int[N];
        
        int num1=0;
        int num2=0;
        int m;
        
        for(int i=0;i<M;i++){
            
            m=sc.nextInt()-1;
            A[m]++;
            
        }
        for(int i=X-1;i>0;i--){
            
            num1+=A[X];
            
        }
        for(int i=X-1;i<N-1;i++){
            
            num2+=A[i];
            
        }
        int min_num = Math.min(num1, num2);
        
        System.out.println(min_num);
        
    }
}
