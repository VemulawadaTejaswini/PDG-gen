import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); 
        
        if (num == 1){
            
            System.out.println(1.0);
        
            
        } else{
            // １より上の奇数の場合
            if (num % 2 == 1 ){
                int cnt = 0;
            
                double ans = 0;
                
                for (int i = 1 ;i <= num ;i++) {
                    if ( i % 2 == 1){
                        cnt++;
                    }
                    
                }
                ans = cnt/num;
                System.out.println(ans);
            } else{
                System.out.println(0.5);
            }
        }
        
    }
}