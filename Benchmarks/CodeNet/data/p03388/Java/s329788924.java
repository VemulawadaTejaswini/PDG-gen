import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int q = scanner.nextInt();
		for (int i=1; i<=q; i++) {
			final int a = scanner.nextInt();
			final int b = scanner.nextInt();
			final int adb = a*b;
			int ans =0;

			int tmp = (int) (Math.pow(10, 18)+1);
			int ak = -1;
			for (int k=1; k<a; k++) {
				int t = (int) Math.ceil(adb/(double)k)-1;
				if (t==b) {ak=k-1; break;}
				if (t<tmp) {
					ans++;
					tmp=t;
				}else if (b < tmp-1) {
					ans++;
					tmp--;
				}else{
					ak = k-1;
					break;
				}
			}

			tmp = (int) (Math.pow(10, 18)+1);
			int bk=-1;
			for (int k=1; k<b; k++) {
				int t = (int) Math.ceil(adb/(double)k)-1;
				if (t==a) {bk=k-1; break;}
				if (t<tmp) {
					ans++;
					tmp=t;
				}else if (a<tmp-1) {
					ans++;
					tmp--;
				}else{
					bk = k-1;
					break;
				}
			}

			if (ak!=-1 && bk!=-1) {
				ans += Math.min(a-1-ak, b-1-bk);
			}
			System.out.println(ans);
		}
	}

}