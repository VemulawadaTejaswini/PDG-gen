import java.util.*;
class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int v=Math.min(s.nextInt()*4,Math.min(s.nextInt()*2,s.nextInt())),d=s.nextInt();
		long n=s.nextInt();
		System.out.println(Math.min(n*v,n/2*d+n%2*v));
	}
}