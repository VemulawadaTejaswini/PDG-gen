import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(kaijo(scan.nextLong()));
	}

	private static long kaijo(long n){
		if(n == 0){
			return 1;
		}else{
			return n * kaijo(n - 1);
		}
	}
}