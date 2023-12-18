import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		String temp = scanner.nextLine();
		String[] list = new String[4];
		int s = 0;
		for(int i = 0; i < 4;i++) {
			list[i] = String.valueOf(temp.charAt(i));
			if(list[i].equals("+")) {
				s++;
			}else {
				s--;
			}
		}
		System.out.println(s);
	}
}