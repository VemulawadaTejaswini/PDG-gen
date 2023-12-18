import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if(K%2 == 0 && (Math.abs(X)+Math.abs(Y))%2 != 0) {
			System.out.println(-1);
		}
		
	}

}
