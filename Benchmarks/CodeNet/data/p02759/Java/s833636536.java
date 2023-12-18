import java.util.*;

class Main {
	Scanner sc;
	int N;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		
		System.out.println( (N+1)/2 );
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
