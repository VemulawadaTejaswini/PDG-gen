import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void debug(Object...os){
		System.err.println(deepToString(os));
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		for(;;){
			int n=sc.nextInt(),U=sc.nextInt();
			if(n==0&&U==0)return;
			boolean[][] f=new boolean[n][n];
			int[] c=new int[n];
			for(int i=0;i<n;i++){
				c[i]=sc.nextInt();
				int k=sc.nextInt();
				for (int j = 0; j < k; j++) {
					f[i][sc.nextInt()] = true;
				}
			}
			for (int k = 0; k < n; k++) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if(f[i][k]&&f[k][j])f[i][j]=true;
					}
				}
			}
			int[] bit=new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(f[i][j])bit[i]|=1<<j;
				}
			}
			int res=n;
			for (int mask = 0; mask < 1<<n; mask++)if(Integer.bitCount(mask)<res) {
				int u = 0;
				boolean ok=true;
				for (int i = 0; i < n; i++)if(((mask>>i)&1)==1) {
					u+=c[i];
					if((bit[i] & mask)!=bit[i])ok=false;
				}
				if(u>=U && ok)res=min(res,Integer.bitCount(mask));
			}
			System.out.println(res);
		}
	}
}