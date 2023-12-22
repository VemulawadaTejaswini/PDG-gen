import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double pi = Math.PI;
		double menseki;
		double enshu;
		menseki = r*r*pi;
		enshu   = r*2*pi;
		System.out.println(String.format("%.6f %.6f", menseki ,enshu));
	}
}