import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			int [] calc = new int[n];
			long sum = 0;
			long calcmax = 0;
			long calcmin = 1 << 30;
			for(int i = 0; i < n; i++){
				calc[i] = data[i] - i - 1;
				sum += calc[i];
				calcmax = Math.max(calcmax, calc[i]);
				calcmin = Math.min(calcmin, calc[i]);
			}

			long [] res = new long[]{sum / n, sum / n + 1, sum / n - 1, calcmax, calcmin};
			int ans = 1 << 30;
			for(int i = 0; i < res.length; i++){
				int now = 0;
				for(int j = 0; j < n; j++){
					now += Math.abs(calc[j] - res[i]);
				}
				ans = Math.min(ans, now);
			}
			
			System.out.println(ans);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
