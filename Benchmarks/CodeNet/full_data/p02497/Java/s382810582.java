import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, r, f, sum;
		while(true) {
			m = sc.nextInt();
			r = sc.nextInt();
			f = sc.nextInt();
			if(m <= 50 && r <= 50 && f <= 100) {
				sum = m + r;
				if(m == -1 && r == -1 && f == -1) break;
				else if(sum >= 80) {
					System.out.println("A");
				} else if(sum >= 65) {
					System.out.println("B");
				} else if(sum >= 50 || (m+r >= 30 && m+r < 50 && f >= 50)) {
					System.out.println("C");
				} else if(sum >= 30) {
					System.out.println("D");
				} else if(sum < 30 || m == -1 || r == -1) {
					System.out.println("F");
				}
			}
		}
	}
}