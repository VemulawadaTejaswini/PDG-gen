
import java.util.*;
public class Main {

	private static final int m = 0;
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int 	n=sc.nextInt();
long m=sc.nextLong();
long ans=0;

ans=Math.min(n,m/2);

m=m-(ans*2);
if(m/4>=1) {
	ans+=m/4;
}
		System.out.println(ans);
	}
}