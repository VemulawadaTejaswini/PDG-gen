import java.util.Scanner;

public class Main {
	//122

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String b = scan.next();
		String result = " " ;

		if (b == "A") {
			result = "T" ;
		} else if (b == "T") {
			result = "A" ;
		} else if (b == "C") {
			result = "G" ;
		} else if (b == "G") {
			result = "C" ;
		}
		  System.out.println(result);
	}
}