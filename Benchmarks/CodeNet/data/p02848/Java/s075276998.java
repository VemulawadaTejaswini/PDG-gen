import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		char[] list = scanner.nextLine().toCharArray();
		String temp = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] alph = temp.toCharArray();
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < list.length; i++) {

			for(int j = 0; j < 27; j++) {

				if(list[i] == alph[j]) {

					list[i] = alph[j + n];
					break;
				}
			}
		}

		for(char t: list) {

			sb.append(String.valueOf(t));

		}

		System.out.println(sb.toString());


	}
}
