import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String s = sc.next();
		int[] GolemPlace = new int[N];
		for(int i = 0; i < N; i++) {
			GolemPlace[i]++;
		}
		String orderedPlace = "";
		String order = "";
		for(int j = 0; j < Q; j++) {
			orderedPlace += sc.next();
			order += sc.next();
		}
		for(int k = 0; k < Q; k++) {
			int buffer = 0;
			int buffer2 = 0;
			for(int l = 0; l < N; l++) {
				if(orderedPlace.charAt(k) == s.charAt(l)) {
					if(order.charAt(k) == 'R') {
						if(l == N - 1) {
							GolemPlace[N - 1] = 0;
							GolemPlace[N - 1] += buffer;
						} else {
							GolemPlace[l + 1] += GolemPlace[l] - buffer;
							buffer2 = GolemPlace[l] - buffer;
							GolemPlace[l] = buffer;
							buffer = buffer2;
						}
					} else {
						if(l == 0) {
							GolemPlace[0] = 0;
						} else {
							GolemPlace[l - 1] += GolemPlace[l] - buffer;
							GolemPlace[l] = buffer;
							buffer = 0;
						}
					}
				}
			}
		}
		int n = 0;
		for(int m = 0; m < N; m++) {
			n += GolemPlace[m];
		}
		System.out.println(n);
	}
}