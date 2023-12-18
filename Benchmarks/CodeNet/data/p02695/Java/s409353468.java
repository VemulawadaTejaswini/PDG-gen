import java.util.*;
 
public class Main {
	public static int[] ans;
	public static int max = 0;
	public static int n;
	public static int m;
	public static int[][] qs;
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int qn = sc.nextInt();
		ans = new int[n];
		qs = new int[qn][4];
		for(int i=0; i<qn; i++){
			qs[i][0] = sc.nextInt();
			qs[i][1] = sc.nextInt();
			qs[i][2] = sc.nextInt();
			qs[i][3] = sc.nextInt();
		}
		saiki(1, 1);
		System.out.println(max);
	}
	
	public static void saiki(int now, int keta){
		for(int i=now; i<=m; i++){
			ans[keta-1] = i;
			if(keta == n) {
				int tmp = 0;
				for(int[] q: qs){
					if(ans[q[1]-1] - ans[q[0]-1] == q[2]){
						tmp += q[3];
					}
				}
				max = Math.max(max, tmp);
				continue;
			}
			saiki(i, keta+1);
		}
	}
}
