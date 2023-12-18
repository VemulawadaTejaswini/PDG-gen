import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int D = sc.nextInt();
		int count =0;
		for (int i=4;i<=M;i++) {
			for (int j=2;j<=D/10;j++) {
				for (int k=2;k<10;k++) {
					int d = j*10+k;
					if (d>D) {
						break;
					}
					if (j*k==i) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
