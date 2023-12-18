import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=gInt(),k=gInt();
		int[]a=IntStream.range(0,n).map(i->gInt()).filter(i->i<k).sorted().toArray();
		n=a.length;

		int res=0;

		boolean[]dp=new boolean[k];
		loop:
		for(int i=n-1;i>=0;--i) {
			Arrays.fill(dp,false);
			dp[0]=true;
			int lim=k-a[i];
			for(int j=n-1;j>=0;--j)if(i!=j){
				int v=a[j];
				for(int m=k-1-v;m>=0;--m) {
					if((dp[m+v]|=dp[m])&&m+v>=lim)
						continue loop;
				}
			}
			++res;
		}
		System.out.println(res);
	}
}