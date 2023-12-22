import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long x = sc.nextInt();
	  long k = sc.nextInt();//moves
      long d = sc.nextInt();
      if(k%2==1) {
        k--;
        x = Math.abs(x - d);
      }
      if(k==0 || d >= x) {
        System.out.println( String.valueOf(x));
      } else {
        long fullMove = x % (2*d);
        long allMove = x - (2 * d * k/2);
        System.out.println( String.valueOf(Math.abs(Math.min(fullMove, allMove))));
      }
    }
}