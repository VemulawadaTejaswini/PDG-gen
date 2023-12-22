import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long X = stdIn.nextLong();
		long restor = 100;
		
		for(int i = 0; ; i ++) {
			if(X <= restor) {
				System.out.println(i);
				break;
			}else {
				restor = restor + (long)(0.01 * restor);
			}
		}
	}
}