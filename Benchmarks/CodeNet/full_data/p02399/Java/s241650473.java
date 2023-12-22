import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		
		Long one = a / b;
		Long two = a % b;

float x = a;
float y = b;

		double three = new BigDecimal(String.valueOf(a / b)).setScale(10, BigDecimal.ROUND_HALF_UP).doubleValue();

		
		System.out.println(one + " " + two + " " + three);

		
				
	}
}

