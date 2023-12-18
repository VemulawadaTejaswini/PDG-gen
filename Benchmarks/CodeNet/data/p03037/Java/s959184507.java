import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		int l=Integer.MIN_VALUE,r=Integer.MAX_VALUE;
		for(int i=0;i<m;++i) {
			l=Math.max(l,s.nextInt());
			r=Math.min(r,s.nextInt());
		}
		System.out.println(r-l+1);
	}
}