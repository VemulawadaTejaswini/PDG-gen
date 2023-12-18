import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		boolean reverse = false;
		int t, f;
		char[] ans = new char[2*q+1];
		int l = q-1, r = q+1;
		for (int i = 0; i < q; i++) {
			t = sc.nextInt();
			if(t==1) {
				reverse = !reverse;
			}else {
				f = sc.nextInt();
				if(!reverse) {
					if(f==1) {
						ans[l] = sc.next().toCharArray()[0];
						l--;
					}else {
						ans[r] = sc.next().toCharArray()[0];
						r++;
					}
				}else {
					if(f==1) {
						ans[r] = sc.next().toCharArray()[0];
						r++;
					}else {
						ans[l] = sc.next().toCharArray()[0];
						l--;
					}
				}
			}
		}
		if(!reverse) {
			StringBuilder sb = new StringBuilder();
			for (int i = l+1; i < r; i++) {
				if(i==q) {
					sb.append(s);
				}else {
					sb.append(ans[i]);
				}
			}
			System.out.println(new String(sb));
		}else {
			StringBuilder sb = new StringBuilder();
			for (int i = r-1; i > q; i--) {
				sb.append(ans[i]);
			}
			System.out.print(new String(sb));
			System.out.print(new StringBuilder(s).reverse());
			sb = new StringBuilder();
			for (int i = q-1; i > l; i--) {
				sb.append(ans[i]);
			}
			System.out.println(new String(sb));
		}
		sc.close();
	}
}