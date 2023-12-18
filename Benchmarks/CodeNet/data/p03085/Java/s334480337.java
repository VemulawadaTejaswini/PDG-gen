import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String ans = "";
		switch (line) {
		case "A":
			ans =  "T";
			break;
		case "C":
			ans =  "G";
			break;
		case "T":
			ans =  "A";
			break;
		case "G":
			ans =  "C";
			break;
		}
		System.out.println(ans);
		scanner.close();
	}
}
