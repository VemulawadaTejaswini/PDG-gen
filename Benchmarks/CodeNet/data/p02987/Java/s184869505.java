import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s =scan.next();
		scan.close();
		char c[]=s.toCharArray();

		if(c[0]==c[1]&&c[2]==c[3]
				|| c[0]==c[2]&&c[1]==c[3]
				|| c[0]==c[3]&&c[1]==c[2])System.out.println("Good");
		else System.out.println("Bad");
	}
}