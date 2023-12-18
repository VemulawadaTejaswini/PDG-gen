import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;


public class Main {
    public static void main(final String[] args){
        final Scanner s = new Scanner(System.in);
        int A = Integer.parseInt(s.next());
        int B = Integer.parseInt(s.next());
        int C = Integer.parseInt(s.next());
        int K = Integer.parseInt(s.next());
        if(A >K){
            System.out.println(K);
        }else if(A+B>K){
            System.out.println(A);
        }else{
            System.out.println(A-(K-A-B));
        }
    }
}
