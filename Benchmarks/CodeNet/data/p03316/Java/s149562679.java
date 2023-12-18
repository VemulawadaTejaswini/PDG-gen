import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = String.valueOf(n);
		int total = 0;

		for (int i =0; i < s.length(); i++){
			char ch = s.charAt(i);
			total += Character.getNumericValue(ch);
		}
		if (n % total == 0){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}