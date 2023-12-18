import java.math.BigInteger;
import java.util.*;

public class Main {
	int INF = 1 << 29;
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(Math.min(a, b) + " " + Math.max(0, a + b - n));
			
		}
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
