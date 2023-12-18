import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String we = sc.next();

		if(we.equals("SAT")) {
			System.out.println(1);
		}
		else if(we.equals("FRI")) {
			System.out.println(2);
		}
		else if(we.equals("THU")) {
			System.out.println(3);
		}
		else if(we.equals("WED")) {
			System.out.println(4);
		}
		else if(we.equals("TUE")) {
			System.out.println(5);
		}
		else if(we.equals("MON")) {
			System.out.println(6);
		}
		else if (we.equals("SUN")){
			System.out.println(7);
		}
	}

}
