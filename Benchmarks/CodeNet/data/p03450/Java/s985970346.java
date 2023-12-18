import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] states;
	static int[] belongs;
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		states = new int[n];
		belongs = new int[n];
		for (int i = 0; i < n; i++) {
			belongs[i] = i;
			states[i] = 0;
		}
		for(int i = 0; i < m; i++) {
			System.out.println("belongs:"+(Arrays.toString(belongs)));
			System.out.println("states:"+Arrays.toString(states));
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			int d = sc.nextInt();
			if(!merge(l,r,d)) {//マージに成功するかどうか
				System.out.println("NO");
				return;
			}
		}
		System.out.println("belongs:"+(Arrays.toString(belongs)));
		System.out.println("states:"+Arrays.toString(states));
		System.out.println("Yes");
	}
	public static boolean merge(int l, int r, int d) {
		int lb = updateBelongs(l);//所属をだす
		int rb = updateBelongs(r);
		if(lb == rb) {//２点の所属が同じか
			return states[r] == states[l] + d;//同じなら満たしているかどうか
		} else {
			belongs[rb] = lb;//所属が違うなら右の人の所属を左の人と合わせる
			states[rb] = states[l] + d - states[r];//右の距離を合わせる
			return true;
		}
	}
	public static int updateBelongs(int a) {
		if(a == belongs[a]) {//aさんの所属番号がaかどうか(所属番号の親かどうか
			return a;
		} else {
			int temp = belongs[a];
			belongs[a] = updateBelongs(belongs[a]);//親を辿って親の所属番号にする
			states[a] += states[temp];
			return belongs[a];
		}
	}
}