import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a <= b && b <= c) System.out.println(Math.abs(c-b) + Math.abs(b-a));
		else if(c <= a && a <= b) System.out.println(Math.abs(b-a) + Math.abs(a-c));
		else System.out.println(Math.abs(a-c) + Math.abs(c-b));
	}
}