import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long C = Long.parseLong(sc.next());
        
        long[] s = new long[N];
        long[] t = new long[N];
        long[] c = new long[N];
  
        for(int i = 0; i < N ; i++){
            
            s[i] = Long.parseLong(sc.next());
            t[i] = Long.parseLong(sc.next());
            c[i] = Long.parseLong(sc.next());
            
        }
        

        System.out.print(C);
        System.out.println();
    }
}

