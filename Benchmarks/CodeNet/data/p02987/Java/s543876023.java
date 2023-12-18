import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		char[] y=s.toCharArray();
		Arrays.sort(y);
		if(y[0]==y[1]&&y[2]==y[3]) System.out.println("Yes");
		else System.out.println("No");

	}

}
