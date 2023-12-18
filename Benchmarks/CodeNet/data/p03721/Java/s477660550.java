import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        
        int c;
        int cnt = 0;


      
        for(int i=0;i<N;i++){
            c = Integer.parseInt(sc.next());
            cnt  += Integer.parseInt(sc.next());
            
            if(cnt >= W) {
                System.out.print(c);
                break;   
            }
            
        }


        System.out.println();
    }

}