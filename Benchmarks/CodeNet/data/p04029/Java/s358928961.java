import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int humanNumber = sc.nextInt();
		int candy = 0;
		for (int i = 1; i <= humanNumber; i++) {
			candy += i;
		}
		if (humanNumber <= 100) {
		System.out.println("N=" + candy);
		} else if (humanNumber >= 101) {
			System.out.println("もう一度入力してください");
		}
	}

}