import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String month = scan.next();

		if(month.equals("SUN"))		System.out.println("7");
		else if(month.equals("MON"))		System.out.println("6");
		else if(month.equals("TUE"))		System.out.println("5");
		else if(month.equals("WED"))		System.out.println("4");
		else if(month.equals("THU"))		System.out.println("3");
		else if(month.equals("FRI"))		System.out.println("2");
		else if(month.equals("SAT"))		System.out.println("1");

	}

}
