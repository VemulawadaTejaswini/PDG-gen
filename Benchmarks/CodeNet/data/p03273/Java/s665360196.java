import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		String[] a = new String[h];
		for (int i = 0; i < h; i++) {
			a[i] = sc.next();
		}
 
		boolean[] hi = new boolean[h];
		//全要素の初期値 false
		Arrays.fill(hi, false);
		boolean[] we = new boolean[w];
		Arrays.fill(we, false);
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i].charAt(j) == '#') {
					hi[i] = true;
					we[j] = true;
				}
			}
		}
 
		for (int i = 0; i < h; i++) {
			if (hi[i]) {
				for (int j = 0; j < w; j++) {
					if (we[j]) {
						System.out.print(a[i].charAt(j));
					}
				}
				System.out.println();
			}
		}
	}
}