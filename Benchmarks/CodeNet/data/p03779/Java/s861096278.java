import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long x = sc.nextLong();
      long n = 0;
      while(n*(n+1)/2 < x){
      	n++;
      }
      System.out.println(n);
    }
}