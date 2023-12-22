import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int A= stdIn.nextInt();
		int B= stdIn.nextInt();
		int C= stdIn.nextInt();
		int K= stdIn.nextInt();
		int counter = 0;

		if(A>=K) {
			counter += K;
		}else if(K>A) {
			counter += A;
			K -= A;
			if(K>B) {
				K -= B;
				if(K>0) {
					counter -= K;
				}
			}
		}
		System.out.println(counter);

		stdIn.close();
	}

}
