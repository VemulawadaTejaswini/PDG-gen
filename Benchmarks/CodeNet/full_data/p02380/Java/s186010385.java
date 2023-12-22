import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		String s = String.format("%.5f", a * b * Math.sin(Math.toRadians(c)) / 2);
		String l = String.format("%.5f", a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(c))));
		String h = String.format("%.5f", b * Math.sin(Math.toRadians(c)));
		
		System.out.println(s + " " + l + " " + h);
	}
}