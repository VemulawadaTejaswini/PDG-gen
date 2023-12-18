import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
      	long aa,bb;
      	
      	aa = a/x;
      	if(a%x == 0) aa--;
      	bb = b/x;     	

		System.out.println(bb-aa);
	}
}