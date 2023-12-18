import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		int k = 0;
		int tmp = -1;
		out: for(int i = 0; i <= N; i++) {
			for(int j = 0; i + j <= N; j++) {
				k = N - i - j;
				if(N == i + j + k && 10000*i + 5000*j + 1000*k == Y) {
					System.out.println(i + " " + j + " " + k);
					tmp++;
					break out;
				}
			}
		}
		if(tmp == -1) {
			System.out.println(tmp + " " + tmp + " " + tmp);
		}
	}

}
