import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      int x = 0;
      for(int i = (int)Math.sqrt(n);i > 0;i--){
      	if(n%i==0){
        	x = (int)n/i;
          break;
        }
      }
      System.out.println(String.valueOf(x).length());
    }
}