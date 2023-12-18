
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String S= "SUN,MON,TUE,WED,THU,FRI,SAT";
		Scanner in=new Scanner(System.in);
		String Day=in.nextLine();

		if(Day.equals("MON")) {
			System.out.println(6);
			System.out.println("It is Monday today, and Six days later, it will be Sunday again.");
		}
		else if(Day.equals("SUN")) {
			System.out.println(7);
			System.out.println("It is Sunday today, and Seven days later, it will be Sunday again.");
		}
		else if(Day.equals("TUE")) {
 			System.out.println(5);
			System.out.println("It is Tuesday today, and Five days later, it will be Sunday again.");
	}
		else if(Day.equals("WED")) {
 			System.out.println(4);
			System.out.println("It is Wednesday today, and Four days later, it will be Sunday again.");
	}
		else if(Day.equals("THU")) {
 			System.out.println(3);
			System.out.println("It is Thursday today, and Three days later, it will be Sunday again.");
	}
		else if(Day.equals("FRI")) {
 			System.out.println(2);
			System.out.println("It is Friday today, and Two days later, it will be Sunday again.");
	}
		else if(Day.equals("SAT")) {
 			System.out.println(1);
			System.out.println("It is Saturday today, and one days later, it will be Sunday again.");
	}
		
		

} 
	}
