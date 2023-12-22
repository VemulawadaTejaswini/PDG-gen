import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		double b = sc.nextDouble();

		double t = (double)a*b;
		System.out.println((long)Math.floor(t));
	}
}