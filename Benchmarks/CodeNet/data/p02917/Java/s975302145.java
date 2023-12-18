import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[] b;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		N = sc.nextInt();
		b = new int[N];
		for (int i = 1; i < N; i++) b[i] = sc.nextInt();
		
		int s = b[1];
		for (int i = 1; i < N-1; i++)
			s += Math.min(b[i], b[i+1]);
		s += b[N-1];
		
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}