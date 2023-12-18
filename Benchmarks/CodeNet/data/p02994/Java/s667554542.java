import java.math.BigInteger;
import java.util.*;

public class Main {
	double EPS = 10.e-08;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int [] data = new int[n];
			long sum = 0;
			for(int i = 0; i < n; i++){
				data[i] = i + a;
				sum += data[i];
			}
			int min = Integer.MAX_VALUE;
			int value = 0;
			for(int i = 0; i < n; i++){
				if(min > Math.abs(data[i])){
					min = Math.abs(data[i]);
					value = data[i];
				}
			}
			System.out.println(sum - value);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
