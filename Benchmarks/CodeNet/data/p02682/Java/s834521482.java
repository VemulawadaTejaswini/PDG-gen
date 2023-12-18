import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String A = Integer.valueOf(s.next());
        String B = Integer.valueOf(s.next());
        String C = Integer.valueOf(s.next());
        String K = Integer.valueOf(s.next());
      
      	if(K - A - B > 0) {
         System.out.println(A + (K - A - B) * (-1)); 
        }else {
         System.out.println(A);
        }
    }
}