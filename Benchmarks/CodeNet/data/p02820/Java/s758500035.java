
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		String t = sc.next();
		String[] divk = new String[k];
		for(int i = 0; i < k; i++) {
			divk[i] = "";
		}
		for(int i = 0; i < n; i++) {
			divk[i % k] += t.charAt(i);
		}
		long ans = 0;
		for(int i = 0; i < k; i++) {
			String j = divk[i];
			char pre = 'a';
			for(int v = 0; v < j.length(); v++) {
				char te = j.charAt(v);
				if(te != pre) {
					if(te == 'r')
						ans += p;
					if(te == 's')
						ans += r;
					if(te == 'p')
						ans += s;
					pre = te;
				} else {
					pre = 'a';
				}
			}
		}
		System.out.println(ans);
	}

}
