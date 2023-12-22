import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long A = scn.nextLong();
		double B = scn.nextDouble();
		scn.close();
		System.out.print(Math.floor(A*B));
	}

}
