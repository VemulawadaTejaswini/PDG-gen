import java.util.*;


public class Main {
	
	private long calc(long num){
		String s = num + "";
		long n = num;
		long sum = 0;
		for(int i = 0; i < s.length(); i++){
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	private long pow(long n){
		long sum = 1;
		for(int i = 0; i < n; i++){
			sum *= 10;
		}
		return sum;
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long n = sc.nextLong();
			String s = n + "";
			long max = calc(n);
			for(int i = 0; i < s.length(); i++){
				long dif = n % pow(i+1) + 1;
				max = Math.max(max, calc(n - dif));
			}
			System.out.println(max);
			
			
			
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
