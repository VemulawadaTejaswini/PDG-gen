import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        String str = "";
        int N = Integer.parseInt(sc.next());
        for(int i=0;i<N;i++){
               int M = Integer.parseInt(sc.next());
               String st = String.valueOf(M);
               str+=st;
               StringBuffer sb = new StringBuffer(str);
               str = sb.reverse().toString();
        }
        char[] c1 = str.toCharArray();
        
        for(int i=0;i<N;i++){
         System.out.print(c1[i]);
         System.out.println();
        }
        
      
    }

}