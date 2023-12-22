import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n ; int[] lst ;
        double sum, a ;
        while(true){
            
            n = sc.nextInt();
            if(n==0)break;
            
            sum = 0 ; a = 0 ;
            
            lst = new int[n];
            for(int i=0;i<n;i++){
                lst[i]=sc.nextInt();
                sum+=lst[i];
            }
            
            sum = sum / n;
            
            for(int i : lst){
                a += (i-sum)*(i-sum);
            }
            
            System.out.println(Math.sqrt(a/n));
        }
    }
}
