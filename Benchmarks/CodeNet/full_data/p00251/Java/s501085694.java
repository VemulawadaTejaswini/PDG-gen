import java.util.Scanner;
public class Main {
	public static void main(String[] a) {
		Scanner stdIn = new Scanner(System.in);
		int r = 0;
		for(int i=0;i<10;i++) r+=stdIn.nextInt();
		System.out.println(r);
	}
}