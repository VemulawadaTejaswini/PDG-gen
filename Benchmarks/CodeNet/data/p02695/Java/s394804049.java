import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		int q = parseInt(sc.next());
		int[] a = new int[q];
		int[] b = new int[q];
		int[] c = new int[q];
		int[] d = new int[q];
		for (i = 0; i < q; i++) {
			a[i] = parseInt(sc.next());
			b[i] = parseInt(sc.next());
			c[i] = parseInt(sc.next());
			d[i] = parseInt(sc.next());
		}
		sc.close();
		int[] aa = new int[10+1];
		Arrays.fill(aa, 1);
		int max=0;
		for (aa[1] = 1; aa[1] <= m; aa[1]++) {
			for (aa[2] = aa[1]; aa[2] <= m; aa[2]++) {
				for (aa[3] = n<3?m:aa[2]; aa[3] <= m; aa[3]++) {
					for (aa[4] = n<4?m:aa[3]; aa[4] <= m; aa[4]++) {
						for (aa[5] = n<5?m:aa[4]; aa[5] <= m; aa[5]++) {
							for (aa[6] = n<6?m:aa[5]; aa[6] <= m; aa[6]++) {
								for (aa[7] = n<7?m:aa[6]; aa[7] <= m; aa[7]++) {
									for (aa[8] = n<8?m:aa[7]; aa[8] <= m; aa[8]++) {
										for (aa[9] = n<9?m:aa[8]; aa[9] <= m; aa[9]++) {
											for (aa[10] = n<10?m:aa[9]; aa[10] <= m; aa[10]++) {
												int tmp=0;
												for (j = 0; j < q; j++) {
													if(aa[b[j]]-aa[a[j]]==c[j])tmp+=d[j];
												}
												//				out.println(Arrays.toString(aa));
												//				out.println(tmp);
												if(max<tmp)max=tmp;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		out.println(max);
	}
}
