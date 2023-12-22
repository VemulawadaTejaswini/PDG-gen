import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b =sc.nextDouble();
		
		int c=(int) ((int)a*(b*100+0.01));
		
		System.out.println(c);
		
		
		sc.close();
	}
}
