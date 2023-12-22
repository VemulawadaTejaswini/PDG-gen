import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}

	static final int mod=10000;

	static final int n=getInt(),k[]=new int[n];
	static{
		Arrays.fill(k,-1);
		for(int i=getInt();i>0;--i)
			k[getInt()-1]=getInt()-1;
		//System.out.println(Arrays.toString(k));
	}

	static long[][][]dp=new long[3][3][n];

	public static void main(String[]$){

		if(k[0]==-1) {
			for(int i=0;i<3;++i)
				for(int j=0;j<3;++j)
					dp[i][j][0]=1;
		}else {
			for(int j=0;j<3;++j)
				dp[k[0]][j][0]=1;
		}

		for(int d=1;d<n;++d) {
			for(int i=0;i<3;++i) if(k[d]==-1||k[d]==i) {
				for(int j=0;j<3;++j) {
					for(int p=0;p<3;++p) if(!(i==j&&j==p)){
						dp[i][j][d]+=dp[j][p][d-1];
						dp[i][j][d]%=mod;
					}
				}
			}
		}

		long r=0;
		for(int i=0;i<3;++i)for(int j=0;j<3;++j) {
				r+=dp[i][j][n-2];
				r%=mod;
		}
		System.out.println(r);
	}
}