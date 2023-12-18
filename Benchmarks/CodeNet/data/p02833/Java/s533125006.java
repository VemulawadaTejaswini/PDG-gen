
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		scan.close();

		if(n%2==1)System.out.println(0);
		else{
			n=(n/10);
			long cnt=0;
			long ans =func(n,cnt);
			System.out.println(0);
		}

	}
	static long func(long n,long cnt) {
		if(n>1) {
			return func(n/10,cnt)*10+2;
		}
		else return 1;
	}

}