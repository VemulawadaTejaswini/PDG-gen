import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt=(N-1)*(N-2)/2-K;
		if (cnt<0) {
			System.out.println(-1);
		} else {
			for (int i=2;i<=N;i++) {
				System.out.println(1 + " " + i);
			}
			for (int i=2;i<=N;i++) {
				for (int j=i+1;j<=N;j++) {
					if (cnt>0) {
						System.out.println(i + " " + j);
					}
					if (cnt==0) {
						break;
					}
					cnt--;
				}
			}
		}
	}
}