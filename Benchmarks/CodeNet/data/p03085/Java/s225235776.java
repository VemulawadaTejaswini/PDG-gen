import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String A = scn.nextLine();
		String ans = "";
		switch(A) {
		case "A":
			ans = "T";
			break;
		case "T":
			ans = "A";
			break;
		case "C":
			ans = "G";
			break;
		case "G":
			ans = "C";
			break;

		}
		System.out.println(ans);
	}

}
