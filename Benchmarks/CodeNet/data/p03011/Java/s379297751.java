import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int q = scan.nextInt();
		int r = scan.nextInt();
		scan.close();
		if(p>q&&p>r)System.out.println(q+r);
		else if(q>p&&q>r)System.out.println(p+r);
		else System.out.println(p+q);
	}
}