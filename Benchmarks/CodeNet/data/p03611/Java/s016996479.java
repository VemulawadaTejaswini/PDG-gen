import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		for(int i = 0;i < N;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int[] cnt = new int[100010];
		for(int i = 0;i < N;i++) {
			cnt[a[i]]++;
			cnt[a[i]+1]++;
			if(a[i] != 0) {
				cnt[a[i]-1]++;
			}
		}
		Arrays.sort(cnt);
		System.out.println(cnt[cnt.length-1]);
	}
}