import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();

		while(Math.abs(X) > D || K == 0) {
			if(X > 0) {
				X = X - D;
			}else {
				X = X + D;
			}
			K--;
		}

		if(K%2 == 0) {
			System.out.println(Math.abs(X));
		}else {
			if(X > 0) {
				X = X - D;
			}else {
				X = X + D;
			}
			System.out.println(Math.abs(X));
		}
	}

}