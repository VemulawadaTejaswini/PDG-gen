import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String A = s.nextInt();
        String B = s.nextInt();
        String C = s.nextInt();
        String K = s.nextInt();
      
      	if(K - A - B > 0) {
         System.out.println(A + (K - A - B) * (-1)); 
        }else {
         System.out.println(A);
        }
    }
}