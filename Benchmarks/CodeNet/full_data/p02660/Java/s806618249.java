import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
 
        final Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int ans=0;
        long q =2;
        int addPara=0;
        HashSet hoge = new HashSet<Long>();
        long n2 = N/2;

        if(N==1){
            System.out.println(0);
            return;
        }else if(N%2 !=0){
            addPara =2;
        }else{
            addPara =1;
        }

        while(q<N){
            if(N%q ==0){
                N = N/q;
                ans ++; 
            }else{
                hoge.add(q);
            }
            q++;
            if(q>n2){
                ans ++;
                break;
            }
        }
       
            System.out.println(ans);
        
    }
}