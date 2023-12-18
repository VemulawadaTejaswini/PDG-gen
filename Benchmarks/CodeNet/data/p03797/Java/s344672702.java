import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // scc puzzle
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int leftOverM = 0;
		int scc = 0;
		if (n * 2 < m) {
			leftOverM = m - (n * 2);
			n += leftOverM / 2;
			m -= leftOverM / 2;
		}
		for (int x = 0; x < n; x++) {
			if (m < 2) {
				scc++;
				n--;
				m--;
				m--;
			} else {
				break;
			}
		}
		System.out.println(scc);
	}

}
