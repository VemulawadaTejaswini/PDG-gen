import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while(true) {
			int count = 0;
			int n = sc.nextInt();
			int x = sc.nextInt();

			if(n == 0 && x == 0) {break;}

			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					for(int k = 1; k <= n; k++) {
						if(i + j + k == x) {
							if(i != j && i != k && j != k) {
								count++;
							}
						}
					}
				}
			}
			System.out.println(count / 6);
		}
		sc.close();
	}
}
