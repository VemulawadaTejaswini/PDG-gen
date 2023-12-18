import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int A = scan.next();
		 int B = scan.next();
		 int K = scan.next();
		 for(int i = 0; i < K; i++) {
			 if(A >= 1) {
				 A -= 1;
			 }else{
				 B -= 1;{
			 }
				 System.out.print(A + " ");
				 System.out.println(B);
			 }
		 }

	}

}