import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		int B = (int)(sc.nextDouble() * 100);
		
		System.out.println((A*B)/100);
		
		sc.close();
	}
}