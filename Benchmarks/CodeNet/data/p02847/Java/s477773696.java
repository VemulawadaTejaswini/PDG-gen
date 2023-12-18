import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if(input.equals("SUN")) {
			System.out.print("7");
		}else if(input.equals("MON")) {
			System.out.print("6");
		}else if(input.equals("TUE")) {
			System.out.print("5");
		}else if(input.equals("WED")) {
			System.out.print("4");
		}else if(input.equals("THU")) {
			System.out.print("3");
		}else if(input.equals("FRI")) {
			System.out.print("2");
		}else if(input.equals("SAT")) {
			System.out.print("1");
		}
	}
}
