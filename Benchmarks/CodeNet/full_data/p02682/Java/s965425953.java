import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Integer A = s.nextInt();
        Integer B = s.nextInt();
        Integer C = s.nextInt();
        Integer K = s.nextInt();
      
      	if(K - A - B > 0) {
         System.out.println(A + (K - A - B) * (-1)); 
        }else {
         System.out.println(A);
        }
    }
}