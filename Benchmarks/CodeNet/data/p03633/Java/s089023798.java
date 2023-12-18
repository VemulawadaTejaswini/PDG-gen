import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        long N = Long.parseLong(sc.next());
        long max = 1;
        for(int i=0;i<N;i++){
            long t = Long.parseLong(sc.next());
            max*=t;
        }

        System.out.print(max);
        System.out.println();
    }

}