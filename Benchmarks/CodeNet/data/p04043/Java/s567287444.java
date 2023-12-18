public class Main {
	public static void main(String[] args) {
		int seven = 0;
		int five = 0;
		String[] num = new String[3];
		for (int i = 0; i < 3; i++) {
			num[i] = new java.util.Scanner(System.in).nextLine();
		}
		for (int i = 0; i < 3; i++) {
			if (num[i].length() == 5) {
				five=five+1;
			}
			if (num[i].length() == 7) {
				seven=seven + 1;
			}

		}

		if (five == 2 && seven == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
