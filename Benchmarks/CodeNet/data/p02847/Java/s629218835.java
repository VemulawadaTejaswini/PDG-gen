import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String day = sc.next();

		switch(day) {
		case "SUN":
			System.out.println(7);
		case "MON":
			System.out.println(6);
		case "TUE":
			System.out.println(5);
		case "WED":
			System.out.println(4);
		case "THU":
			System.out.println(3);
		case "FRI":
			System.out.println(2);
		case "SAT":
			System.out.println(1);
		}
	}

}
