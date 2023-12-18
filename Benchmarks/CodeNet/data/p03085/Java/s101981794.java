import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String ans = "";
		switch (line) {
		case "A":
			ans =  "C";
			break;
		case "C":
			ans =  "A";
			break;
		case "G":
			ans =  "T";
			break;
		case "T":
			ans =  "G";
			break;
		}
		System.out.println(ans);
		scanner.close();
	}
}
