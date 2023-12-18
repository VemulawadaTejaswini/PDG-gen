import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//入力
		int n = sc.nextInt();
		String s = sc.next();

		int ans = 0;
		for(int i=0; i<n; i++) {
			if(s.charAt(i) == '#') {
				int p = 0;
				for(int j=i; j<n; j++) {
					if(s.charAt(j) == '#') {
						p++;
					}else {
						break;
					}
				}
				int q = 0;
				for(int k=i+p; k<n; k++) {
					if(s.charAt(k) == '.') {
						q++;
					}else {
						break;
					}
				}
				ans += Math.min(p, q);
				i += p + q - 1;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
