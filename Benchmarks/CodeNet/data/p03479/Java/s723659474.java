import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long x = sc.nextLong();
      long y = sc.nextLong();
      long n = 1;
      while(true){
      	if(x*Math.pow(2,n-1)>y){
        	n--;
            break;
        }
        n++;
      }
      System.out.println(n);
    }
}