import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int min = 0;
        int max = A;

        if(A < B) {
        	max = A;
        	if(B > N /2) {
        		min = B - A;
        	}
        }else if(A > B) {
        	max = B;
        	if(A > N /2) {
        		min = A - B;
        	}
        }else {
        	max = A;
        	min = (N == A && N == B) ? A : 0;
        }

        System.out.println(max + " " + min);
	}

}