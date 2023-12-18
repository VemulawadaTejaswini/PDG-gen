
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int n = in.nextInt();
		if(d==0) {
			int num = n/100;
			System.out.println(n+num);
		}else if(d==1) {
			int num = n/10000;
			System.out.println((n+num)*100);
		}else {
			int num = n/1000000;
			System.out.println((n+num)*10000);
		}

	}

}