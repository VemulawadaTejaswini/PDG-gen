import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int count = 0;

		Scanner sc = new Scanner(System.in);

		String[] s = sc.next().split("");

		for(int i = 0; i < 3; i++) {
			if(s[i].equals("1")) {
				count++;
			}
		}

		System.out.println(count);
	}
}