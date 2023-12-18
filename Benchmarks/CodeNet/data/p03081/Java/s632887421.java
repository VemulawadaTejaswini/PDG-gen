import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),Q=s.nextInt();
		char[]c=s.next().toCharArray();
		int[]d=new int[n];

		int l=-1,r=n;
		char[][]q=new char[Q][2];
		for(int i=0;i<Q;++i) {
			q[i][0]=s.next().charAt(0);
			q[i][1]=s.next().charAt(0);
		}
		for(int i=Q-1;i>=0;--i) {
			if(l<n-1&&q[i][1]=='L'&&q[i][0]==c[l+1]) {
				d[++l]=1;
			}

			if(r>0&&q[i][1]=='R'&&q[i][0]==c[r-1]) {
				d[--r]=1;
			}
		}
		//System.err.println(Arrays.toString(d));
		System.out.println(n-Arrays.stream(d).sum());
	}
}