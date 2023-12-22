import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int counter = 0;
		String DNA, RNA;
		try (Scanner sc = new Scanner(System.in)) {
			RNA = sc.nextLine();
			while(true) {
				DNA = sc.next();
				if(DNA.equals("END_OF_TEXT")) {
					break;
				}
				DNA = DNA.toLowerCase();
				if(DNA.equals(RNA)) {
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}

