import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		float a_f = (float)Math.floor((double)a * 100000) / 100000;
		float b_f = (float)Math.floor((double)b * 100000) / 100000;
		System.out.println((a/b) + " " + (a%b) + " " + (a_f / b_f));
	}

}