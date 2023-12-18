import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long l = sc.nextLong();
	  long r = sc.nextLong();
      
      long min1 = 2000000000;
      long min2 = 2000000000;
      long num;
      for(long i = l; i <= r; i++) {
        num = i%2019;
        if(num < min2)
          min2 = num;
        if(num < min1) {
          min2 = min1;
          min1 = num;
        }
      }
      System.out.println(min1*min2);


	}
}