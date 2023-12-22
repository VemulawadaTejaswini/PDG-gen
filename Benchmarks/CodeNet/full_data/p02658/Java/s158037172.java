import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
 
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        long An = 1;
        long temp =1;
        int flag=0;
        //final long answer=1;
        final long max = 1000000000000000000l;


        for(long i = 0; i < N; i++) {
            temp = sc.nextInt();
            if(temp == 0){
                System.out.println(0);
               return;
            }else if(max / temp <An){
                flag = 1;
                An =1;
            }else{
                An = An * temp;
            }
            if(An >max){
                flag = 1;
                An =1;
            }
        }

        if(flag != 0){
            System.out.println(-1);
        }else{
            System.out.println(An);
        }
    
    }
}