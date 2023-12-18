import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
 		//hwd
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		//2jigen hairetu
		ArrayList<ArrayList<Integer>> arys;
		for(int i = 0; i<h; i++) {
			ArrayList<Integer> ary = new ArrayList<>();
			for(int r = 0; r < w; r++) {
				ary.add(sc.nextInt());
			}
			arys.add(ary);
		}
		//q kaisuu
		int q = sc.nextInt();
		for(int a = 0; a < q; a++) {
			int ans = 0;
			int l = sc.nextInt();
			int f = sc.nextInt();
			for (int b = 0; b < f/l; b++) {
				//Li syutoku
				l += d;
				int aa;
				int bb;
				for(int c = 0; c < h; c++) {
				aa = arys.get(c).indexOf(l);
				bb = c;
				}
				for(int dd = 0; dd < h; dd++) {
					aa = Math.abs(aa - arys.get(dd).indexOf(l-d));
					bb = Math.abs(bb - dd);
					}
				//li+1 sawomotomeru
				//ans kasan
				ans += aa + bb;
				
			}
			System.out.println(ans);
			
		}
		sc.close();
	}