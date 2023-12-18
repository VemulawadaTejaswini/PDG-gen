import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= 9; i++) {
			if(111*i/n == 1) {
				System.out.println(111*i);
				break;
			}
		}
	}
}