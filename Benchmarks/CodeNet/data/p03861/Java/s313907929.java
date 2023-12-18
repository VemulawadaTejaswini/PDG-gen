import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long x = sc.nextLong();
      long countA = 0;
      if(a==0)countA = 0;
      else countA = (a-1)/x+1;
      long countB = b/x+1;
      System.out.println(countB-countA);
    }
}
