import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.next();
		int ans1 = 0;
		int ans2 = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.getNumericValue(ch) != i%2) {
				ans1++;
			}
			if (Character.getNumericValue(ch) != (i+1)%2) {
				ans2++;
			}
		}


		System.out.println(Math.min(ans1, ans2));
		reader.close();

	}

}



