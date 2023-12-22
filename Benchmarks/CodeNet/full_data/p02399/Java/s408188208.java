import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=Integer.parseInt(scan.next());
		int b=Integer.parseInt(scan.next());
		System.out.print(a/b+" "+a%b);
		double f = (double)a/b;
		System.out.println(" "+f);
		scan.close();
	}
}