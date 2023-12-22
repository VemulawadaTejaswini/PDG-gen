import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			int m = sc.nextInt();
			int nMin = sc.nextInt();
			int nMax = sc.nextInt();

			if(m == 0 && nMin == 0 && nMax ==0) {
				break;
			}
			int[] x = new int[m];
			int [] gaps = new int[m-1];

			for(int i = 0; i < m; i++) {
				x[i] = sc.nextInt();
			}
			Arrays.sort(x);

			for(int i = 0; i < m-1; i++) {
				gaps[i] = x[i+1] - x[i];
			}
			int maxIdx = m-nMin-1;
			for(int i = m-nMin-1; i >= m-nMax-1; i--) {
				if(gaps[i] >= gaps[maxIdx]) {
					maxIdx = i;
				}
			}
			System.out.println(m-maxIdx-1);
		}
	}
}
