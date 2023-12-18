import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());//店の数
		int m = Integer.parseInt(sc.next());//買いたい本数
		long [][] a = new long[n][2];
		for(int i=0; i<n;i++) {
			a[i][0] = Long.parseLong(sc.next());
			a[i][1] = Long.parseLong(sc.next());
		}
		sc.close();

		Arrays.sort(a,(a1,a2)->Long.compare(a1[0],a2[0]));
		long cnt=0,sumYen=0;
		for(int i=0;i<n&&cnt<m;i++) {
			for(long j=a[i][1];cnt<m&&j>0;j--) {
				cnt++;
				sumYen+=a[i][0];
			}
			//System.out.println(a[i][0]+" "+a[i][1]);
		}
		System.out.println(sumYen);
	}
}
