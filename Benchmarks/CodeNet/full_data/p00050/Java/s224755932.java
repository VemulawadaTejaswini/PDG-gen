import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str[];
		
		str = sc.nextLine().split(" ");
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("apple")) {
				str[i] = "peach";
			} else if (str[i].equals("peach")) {
				str[i] = "apple";
			} else if (i == str.length - 1) {
				if (str[i].equals("apple.")) {
					str[i] = "peach.";
				} else if (str[i].equals("peach.")) {
					str[i] = "apple.";
				}
			}
		}
		String s = "";
		for (int i = 0; i < str.length; i++) {
			System.out.print(s + str[i]);
			s = " ";
		}
		System.out.println();
	}
}