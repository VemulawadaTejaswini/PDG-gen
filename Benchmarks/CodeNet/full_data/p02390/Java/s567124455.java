import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int h = x/3600;
		int m = x%3600/60;
		int s = x%60;

		System.out.println(h + ":" + m + ":" + s);

		sc.close();
	}
}
