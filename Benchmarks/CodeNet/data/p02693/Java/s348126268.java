import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int K = cin.nextInt();
		int A = cin.nextInt();
		int B = cin.nextInt();
		
		int start = A/K;
		int end = B/K;
		
		for(int i = start;i<=end;i++) {
			int target = i*K;
			if(A<=target&&B>=target) {
				System.out.println("OK");
				return;
			}
		}
		
		System.out.println("NG");
		

	}

}
