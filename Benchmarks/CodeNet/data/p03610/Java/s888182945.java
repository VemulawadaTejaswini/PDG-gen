import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String data = "";

		for(int i = 1; i <= s.length(); i++) {
			if(i % 2 == 1) {
				data = data + s.substring(i-1, i);
			}
		}

		System.out.println(data);
	}

}
