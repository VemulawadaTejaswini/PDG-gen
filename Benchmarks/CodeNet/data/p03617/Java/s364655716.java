import java.util.*;

public class Main {
	int MOD = 1000000007;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			long n = sc.nextLong();
			
			long [] data = new long[3];
			data[0] = a * 4;
			data[1] = b * 2;
			data[2] = c;
			Arrays.sort(data);
			if(n == 1){
				System.out.println(data[0]);
				continue;
			}
			
			long res = data[0] * 2;
			if(res > d){
				res = d;
			}
			if(n % 2 == 0){
				System.out.println((long)res * (n / 2));
			}
			else{
				System.out.println((long)res * (n / 2) + data[0]);
			}
			
			
		}
	}



	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
