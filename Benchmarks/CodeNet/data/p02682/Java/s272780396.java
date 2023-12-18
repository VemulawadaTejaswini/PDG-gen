import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Long A = Long.valueOf(s.next());
        Long B = Long.valueOf(s.next());
        Long C = Long.valueOf(s.next());
        Long K = Long.valueOf(s.next());
      
      	if(K - A - B > 0) {
         System.out.println(A + (K - A - B) * (-1)); 
        }else {
         System.out.println(A);
        }
    }
}