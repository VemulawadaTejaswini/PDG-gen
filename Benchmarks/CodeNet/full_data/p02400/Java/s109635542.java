import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		System.out.print(r * r * Math.PI + " ");
		System.out.println((r + r) * Math.PI);
		
		sc.close();
	}
}