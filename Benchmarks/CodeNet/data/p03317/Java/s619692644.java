import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int p = 0;
		for(int i = 0; i < N; i++) {
			int a = scan.nextInt();
			if(a == 1) {
				p = i;
			}
		}
		scan.close();
		int r = 0;
		int l = 0;
		int min = N;
		for(int i = 0; i < K; i++) {
			int cnt = 0;
			l = p - K + i + 1;
			r = p + i;
			if(l > 0) {
				while(l > 0) {
					l = l - K + 1;
					cnt ++;
				}
			}else {
				cnt ++;
			}
			if(r < N - 1) {
				while(r < N - 1) {
					r = r + K - 1;
					cnt ++;
				}
			}else {
				cnt ++;
			}
			if(min > cnt) {
				min = cnt;
			}
		}
		System.out.println(min);


	}
}