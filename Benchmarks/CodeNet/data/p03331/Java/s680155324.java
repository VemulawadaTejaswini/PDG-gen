import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int min = Integer.MAX_VALUE;
			for(int i = 1; i < n;i++){
				int a = i;
				int b = n - i;
				int sum = 0;
				while(a > 10){
					sum += a % 10;
					a /= 10;
				}
				sum += a;
				while(b > 10){
					sum += b % 10;
					b /= 10;
				}
				sum += b;
				
				min = Math.min(min, sum);
			}
			System.out.println(min);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
