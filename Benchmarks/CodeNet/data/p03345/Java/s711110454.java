import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long k = sc.nextLong();
			
			if(k%2==1){
				System.out.println(b-a);
			}
			else{
				System.out.println(a-b);
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
