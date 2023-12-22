import java.util.*;
public class Calc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println((long)(a+Math.pow(a, 2)+Math.pow(a, 3)));
	}

}
