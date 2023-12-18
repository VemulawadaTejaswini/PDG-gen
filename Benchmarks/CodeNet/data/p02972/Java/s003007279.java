import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) a[i] = sc.nextInt();
		int[] ball = new int[N];

		for(int k = N; k >= 1; k--) {
			int cnt = 0;
			for(int i = k; i <= N; i += k) cnt += ball[i - 1];
			if(cnt % 2 == a[k - 1]) continue;
			else ball[k - 1]++;
		}

		int num = 0;
		for(int i = 0; i < N; i++) if(ball[i] == 1) num++;
		System.out.println(num);
		for(int i = 0; i < N; i++) if(ball[i] == 1) System.out.println(i + 1);
	}
}
