import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int A= stdIn.nextInt();
		int B= stdIn.nextInt();
		int C= stdIn.nextInt();
		int K= stdIn.nextInt();
		int counter = 0;

		while(K>0) {
			if(A>0) {
				counter++;
				A--;
				K--;
			}else if(B>0){
				B--;
				K--;
			}else {
				C--;
				counter--;
			}
			if(K == 0) {
				System.out.println(counter);
				break;
			}
		}
		stdIn.close();
	}

}
