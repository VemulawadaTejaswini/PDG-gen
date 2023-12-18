import java.math.BigInteger;
import java.util.*;

public class Main {
	double EPS = 10.e-08;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [][] data = new int[n][2];
			for(int i = 0; i < n; i++){
				data[i][0] = sc.nextInt();
				data[i][1] = sc.nextInt();
			}
			Arrays.sort(data, (a, b) -> Integer.compare(a[1], b[1]));
			
			long sum = 0;
			boolean flg = true;
			for(int i = 0; i < n; i++){
				sum += data[i][0];
				if(sum > data[i][1]){
					flg = false;
					break;
				}
			}
			System.out.println(flg ? "Yes":"No");
		}
	}
	
	private long gcd(long a, long b){
		if(b == 0)  return a;
		else        return gcd(b, a%b);
	}
	
	private long lcm(long a, long b){
		return a / gcd(a, b) * b;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
