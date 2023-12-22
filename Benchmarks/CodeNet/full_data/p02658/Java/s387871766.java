
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Long> A = new ArrayList<Long>();
		for(int i=0; i<N; i++) {
			long v = sc.nextLong();
			if(v==0) {
				System.out.println(0);
				sc.close();
				return;
			}
			A.add(v);
		}
		Collections.sort(A);
		long LIM = 1000000000000000000L;
		long ans = A.get(0);
		for(int i=1 ;i<N; i++) {
			if(ans * A.get(i)>LIM) {
				System.out.println(-1);
				sc.close();
				return;
			}
			ans = ans * A.get(i);
		}
		System.out.println(ans);
		sc.close();
	}


}