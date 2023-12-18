import java.util.*;
public class Main{
	public static void main(String[]$){
		Scanner c=new Scanner(System.in);
		String s=c.next();
		int n=s.length(),t=n,i=n;
		while(i-->1)t=Math.min(t,s.charAt(i-1)!=s.charAt(i)?Math.max(i,n-i):n);
		System.out.println(t);
	}
}