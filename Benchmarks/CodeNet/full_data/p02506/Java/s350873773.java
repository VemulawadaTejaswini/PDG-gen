import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String model;
		String words = "";
		int i = 0, j = 0,count = 0;
		model = (sc.next()).toLowerCase();
		while (true) {
			words = sc.next();
			if (words.endsWith("END_OF_TEXT")) break;
			words = words.toLowerCase();
			if (words.equals(model))count++;
		}
		System.out.println(count);
	}
}