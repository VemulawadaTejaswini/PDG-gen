
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		
		int uder_hundred = num % 100;
		int under_ten = uder_hundred % 10;
		
		String out = "";
		switch (under_ten) {
		case 2:
		case 4:
		case 5:
		case 7:
		case 9:
			out = "hon";
			break;
		case 0:
		case 6:
		case 1:
		case 8:
			out = "pon";
			break;
						
		case 3:
			out = "bon";
			break;
			
		}
		
		System.out.println(out);
		
	}

}
