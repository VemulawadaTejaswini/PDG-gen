import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] k = new int[m];
		int[] s = new int[m];
		for(i = 0; i <m; i++) {
			k[i] = Integer.parseInt(sc.next());
			s[i] = 0;
			for(j = 0; j <k[i]; j++) {
				int aa = 1 << (Integer.parseInt(sc.next()) -1);
				s[i] |= (aa);
			}
		}
		int[] p = new int[m];
		for(i = 0; i <m; i++) {
			p[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		sc = null;
		int max = (int) Math.pow(2, n);
		int cnt = 0;
		for(i = 0; i <max; i++) {
			for(j = 0; j <m; j++) {
				if(Integer.bitCount(s[j] & i) % 2 != p[j] ) {
					break;
				}
			}
			if(j == m) cnt++;
		}
		System.out.println(cnt);
	}
}