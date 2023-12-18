import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();

		if(Y%1000!=0) {
			System.out.println("-1 -1 -1");
			return;
		}

		for(int i = 0; i <= N; i++) {
			for(int j = 0; j + i <= N; j++) {
				for(int k = 0; k + j + i<= N; k++) {
					if(10*k+5*j+i == Y/1000) {
						System.out.println(k + " " + j + " " + i);
						return;
					}
				}
			}
		}
		System.out.println("-1 -1 -1");
	}

}