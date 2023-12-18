import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		System.out.println(t+s);
	}

	public static long f5(long n) {
		if(n%5!=0) {
			return 0;
		}else{
			return 1+f5(n/5);
		}
	}
}


