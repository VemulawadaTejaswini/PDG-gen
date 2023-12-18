import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.nextInt();
		pw.print(Math.round(Math.pow(N, 3)));
		pw.close();
	}
}