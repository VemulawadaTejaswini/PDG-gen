import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int []s = new int[n];
			for(int i = 0; i < n; i++) s[i] = sc.nextInt();
			int []a = ofa(s);
			int cnt = 0;
			while(!same(s, a)) {
				System.arraycopy(a, 0, s, 0, n);
				a = ofa(a);
				cnt++;
			}
			System.out.println(cnt);
			disp(s);
		}
		sc.close();
	}
	static void disp(int []a) {
		for(int i = 0; i < a.length; i++) {
			if(i == a.length - 1) {
				System.out.println(a[i]);
			}else {
				System.out.printf("%d ", a[i]);
			}
		}
	}
	static int[] ofa(int []a) {
		int l = a.length;
		int []b = new int[l];
		int []c = new int[101];
		for(int i = 0; i < l; i++) {
			c[a[i]]++;
		}
		for(int i = 0; i < l; i++) {
			b[i] = c[a[i]];
		}
		return b;
	}
	static boolean same(int []a, int []b) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}
