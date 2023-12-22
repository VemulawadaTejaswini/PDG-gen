import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
	  int k = sc.nextInt();//moves
      int d = sc.nextInt();
      if(k%2==1) {
        k--;
        x = Math.abs(x - d);
      }
      if(k==0 || d >= x) {
        System.out.println( String.valueOf(x));
      } else {
        int fullMove = x % (2*d);
        int allMove = x - (2 * d * k/2);
        System.out.println( String.valueOf(Math.max(fullMove, allMove)));
      }
    }
}