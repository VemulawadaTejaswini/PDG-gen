import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		b = b*100;
		long ans  = a*(long)b;
		System.out.println(ans/100);
	}
}
