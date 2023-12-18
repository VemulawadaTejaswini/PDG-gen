
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int tmp = 0;
		int N = scan.nextInt();
		int[] p = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = scan.nextInt();
		}
		for(int i = 0; i < N - 1; i++) {
			if(i + 1 == p[i]) {
				tmp = p[i];
				p[i] = p[i + 1];
				p[i + 1] = tmp;
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}

}
