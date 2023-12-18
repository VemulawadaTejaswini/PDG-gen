import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int count1 = 0;

		for(int i = 0; i < n; i++) {
			int b = sc.nextInt();
			if(b%4 == 0) {
				count++;
			}else if(b%2 == 0) {
				count1++;
			}else {
				count--;
			}
		}
		System.out.println(count >= 0|| (count == -1 && count1 == 0) ? "Yes" : "No");
		sc.close();
	}
}