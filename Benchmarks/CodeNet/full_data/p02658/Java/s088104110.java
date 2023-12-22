
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
		for(int i=0; i<N; i++) A.add(sc.nextLong());
		long LIM = 1000000000000000000L;
		long ans = A.get(0);
		for(int i=1; i<N; i++) {
			ans *= A.get(i);
		}
		if(ans>LIM){
			ans = -1;
		}
		System.out.println(ans);
		sc.close();
	}


}