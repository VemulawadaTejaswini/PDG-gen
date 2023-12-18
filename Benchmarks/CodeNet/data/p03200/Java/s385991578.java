import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		char[]c=s.next().toCharArray();
		
		int n=c.length;
		long r=0,d=0;
		for(int i=0;i<n;++i) {
			if(c[i]=='B')
				++d;
			else
				r+=d;
		}
		System.out.println(r);
	}
}
