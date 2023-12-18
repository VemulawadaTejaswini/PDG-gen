import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int num = 0;
		scan.close();
		
		if(str.equals("SUN")) {num = 7;}
		else if (str.equals("MON")) {num = 6;}
		else if (str.equals("TUE")) {num = 5;}
		else if (str.equals("WED")) {num = 4;}
		else if (str.equals("THU")) {num = 3;}
		else if (str.equals("FRI")) {num = 2;}
		else if (str.equals("SAT")) {num = 1;}
		
		System.out.println(num);
	}
}


