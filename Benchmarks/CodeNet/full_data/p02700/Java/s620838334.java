import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int D = input.nextInt();
		
		takahasi(A,B,C,D);
		
	}
	public static void takahasi(int A,int B,int C,int D) {
		if((C-B)==0) {
			System.out.println("Yes");
		}
		else {
			aoki(A,B,C,D);
		}
	}
	public static void aoki(int A,int B,int C,int D) {
		if((A-D)==0) {
			System.out.println("No");
		}
		else {
			takahasi(A,B,C,D);
		}
	}
	
	
}
