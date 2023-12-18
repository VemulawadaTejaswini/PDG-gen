import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int [] Ls = new int [N];
		int sum = 0;
		for(int i=0; i<N; i++) {
			Ls[i] = sc.nextInt();
			sum += Ls[i];
		}
		Arrays.sort(Ls);
		if(Ls[N-1] < (sum - Ls[N-1]) ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}
}