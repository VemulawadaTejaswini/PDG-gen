import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		float r = sc.nextInt();
		float p = (float) Math.PI;

		System.out.println((r*r)*p + " " + (2*r)*p);

		sc.close();
	}
}
