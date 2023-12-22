import java.util.Scanner;
public class Main {
	public static int gcd(int x, int y) {if (y==0) {return x;}return gcd(y,x%y);}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(gcd(s.nextInt(),s.nextInt()));
	}
}