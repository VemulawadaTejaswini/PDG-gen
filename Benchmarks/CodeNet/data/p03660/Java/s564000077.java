import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        Long[] a = new Long[N];
        Long[] b = new Long[N];
        long t = 0;
        for(int i=0; i < N-1 ; i++){
            a[i] = Long.parseLong(sc.next());
            b[i] = Long.parseLong(sc.next());
            
        }
        
        if(N%2==0)System.out.print("Fennec");
        else      System.out.print("Suneke");
      
        System.out.println();
    }

}