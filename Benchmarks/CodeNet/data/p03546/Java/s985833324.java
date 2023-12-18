import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD = 1000000007;
	public static final int TEN = 10;
	public static int[][] c = new int[TEN][TEN];
	public static int[] mana = new int[TEN];
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int h = parseInt(sc.next());
		int w = parseInt(sc.next());
		for (i = 0; i < TEN; i++) {
			for (j = 0; j < TEN; j++) {
				c[i][j] = parseInt(sc.next());
			}
		}
		int[][] a = new int[h][w];
		for (i = 0; i < h; i++) {
			for (j = 0; j < w; j++) {
				a[i][j] = parseInt(sc.next());
			}
		}
		sc.close();
		for (i = 0; i < TEN; i++) {
			if(i==1)continue;
			mana[i] = calcMana(i, 0);
		}
//		out.println(Arrays.toString(mana));
		int ans=0;
		for (i = 0; i < h; i++) {
			for (j = 0; j < w; j++) {
				if(a[i][j]==-1)continue;
				ans+=mana[a[i][j]];
			}
		}
		out.println(ans);
	}
	public static int calcMana(int no, int num) {
		int mn;
//		out.printf("calcMana(%d)%n",no);
		if(mana[no]==0) {
			mn=c[no][1];
			for (int i = 0; i < TEN; i++) {
				if(i==no||i==1) continue;
				if(mn>c[no][i]+num) {
					int tmp=c[no][i]+calcMana(i, c[no][i]+num);
					if(mn>tmp) {
						mn = tmp;
					}
				}
			}
		} else {
			mn=mana[no];
		}
		return mn;
	}
}
