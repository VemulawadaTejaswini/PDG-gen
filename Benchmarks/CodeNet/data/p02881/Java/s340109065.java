import java.util.*;

public class Main {
	double EPS = 10.e-08;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long n = sc.nextLong();
			long target = 1;
			for(long i=2; i * i <= n; i++){
				if(n % i == 0){
					target = i;
				}
			}
			System.out.println(target - 1 + (n / target) - 1);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
