
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numA = s.nextInt();
		String str = s.next();
		
		if(numA >= 3200) {
			System.out.println("red");
		}else {
			System.out.println(str);
		}

	}

}