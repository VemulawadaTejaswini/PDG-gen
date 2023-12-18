import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        String S  = sc.nextLine();


		       int A = S.charAt(2);
		       int B = S.charAt(3);
		       int C = S.charAt(4);
		       int D = S.charAt(5);

		        if(A == B) {
		        	if(C == D) {
		        		System.out.println("Yes");
		        	}
		        	else{
		        		System.out.println("No");
		        	}
		        }else {
		        	System.out.println("No");
		        }

	}
}