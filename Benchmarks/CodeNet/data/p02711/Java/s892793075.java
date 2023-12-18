import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n / 100 == 7) {
			System.out.println("Yes");
		} else if ((n % 100) / 10 == 7) {
			System.out.println("Yes");
		} else if ((n % 10) == 7){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		s.close();
	}
}
