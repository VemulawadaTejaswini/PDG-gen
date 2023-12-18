import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		Integer[] b = new Integer[3];
		b[0]  =A+B;
		b[1] =A-B;
		b[2] =A*B;
		Arrays.sort(b,Comparator.reverseOrder());
		System.out.println(b[0]);
		
	}

}
