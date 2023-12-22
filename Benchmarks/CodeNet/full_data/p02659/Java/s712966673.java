import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		double m = sc.nextDouble();
		long mm = (long) (m * 100.00);
		long res = n * mm -(n * mm % 100);
		System.out.println(res);
	}
}
