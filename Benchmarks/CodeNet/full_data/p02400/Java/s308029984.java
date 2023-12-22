import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = r * r * (double)Math.PI;
		System.out.printf("%08f", area);
	}
}