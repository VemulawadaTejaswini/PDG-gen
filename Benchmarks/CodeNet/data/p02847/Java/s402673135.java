import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
		String s = scan.nextLine();
		int ans = 0;
		switch(s) {
		case "SUN":ans = 7;
		break;
		case "SUT":ans = 1;
		break;
		case "FRI":ans = 2;
		break;
		case "THU":ans = 3;
		break;
		case "WED":ans = 4;
		break;
		case "TUE":ans = 5;
		break;
		case "MON":ans = 6;
		break;
		}
		System.out.println(ans);
	}
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int ans = 0;
		switch(s) {
		case "SUN":ans = 7;
		break;
		case "SAT":ans = 1;
		break;
		case "FRI":ans = 2;
		break;
		case "THU":ans = 3;
		break;
		case "WED":ans = 4;
		break;
		case "TUE":ans = 5;
		break;
		case "MON":ans = 6;
		break;
		}
		System.out.println(ans);
	}
}