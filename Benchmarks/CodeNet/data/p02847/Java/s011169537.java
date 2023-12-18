import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int a = 0;

		switch(s) {
		case "SUN":
			a = 7;
			break;
		case "MON":
			a = 6;
			break;
		case "TUE":
			a = 5;
			break;
		case "WED":
			a = 4;
			break;
		case "THU":
			a = 3;
			break;
		case "FRI":
			a = 2;
			break;
		case "SAT":
			a = 1;
			break;
		}

		System.out.println(a);

		sc.close();
	}

}
