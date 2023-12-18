import java.util.Scanner;
	public static void main(String[] args) {
		String str = new Scanner(System.in).next();

		if (str.equals("ARC")) {
			str = "ABC";
		}
		else {
			str = "ARC";
		}

		System.out.println(str);
	}