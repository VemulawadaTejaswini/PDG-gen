import java.util.*;

public class Main{
	
	static int gcd(int a,int b) {
		return a%b==0?b:gcd(b,a%b);
	}
	
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),x=s.nextInt();
		
		int g=-1;
		
		for(int i=0;i<n;++i) {
			int y=s.nextInt();
			if(g==-1)
				g=Math.abs(y-x);
			else
				g=gcd(g,Math.abs(y-x));
			y=x;
		}
		System.out.println(g);
	}
}
