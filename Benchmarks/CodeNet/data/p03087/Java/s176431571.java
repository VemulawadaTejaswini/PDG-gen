import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[] a = new int[n];
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			if(flag) {
				if(s[i] == 'C') {
					a[i] += 1;
					flag = false;
				}else if(s[i] == 'A') flag = true;
				else flag = false;
			}else {
				if(s[i] == 'A') flag = true;
			}
			a[i] += (i>0)?a[i-1]:0;
		}
		int l = 0, r = 0;
		for (int i = 0; i < q; i++) {
			l = sc.nextInt()-1;
			r = sc.nextInt()-1;
			if(l == 0) {
				System.out.println(a[r]);
			}else {
				n = (s[l]=='C'&&s[l-1]=='A')?1:0;
				System.out.println(a[r]-a[l-1]-n);
			}
		}
		sc.close();
	}
}