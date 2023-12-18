import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long q = sc.nextLong();
      long h = sc.nextLong();
      long s = sc.nextLong();
      long d = sc.nextLong();
      long n = sc.nextLong();
      long min = Math.min(q*4,Math.min(h,s/2));
      if(n%2==0){
      	System.out.println(min*n);
      }else{
      	if(min==s/2)System.out.println(s*(n/2)+Math.min(q*4,h));
        else System.out.println(min*n);
      }
    }
}