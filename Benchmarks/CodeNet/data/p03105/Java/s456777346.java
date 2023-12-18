
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int s=b/a;
		if(s<=c) {
			System.out.println(s);
		}
		else {
			System.out.println(s-1);
		}
	}

}