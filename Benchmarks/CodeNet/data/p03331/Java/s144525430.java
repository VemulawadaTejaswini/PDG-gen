import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			int len = s.length();
			int sum = 0;
			if(s.charAt(0) == '1'){
				sum += 10;
			}
			else{
				sum += s.charAt(0)- '0';
			}
			
			for(int i = 1; i < len; i++){
				sum += s.charAt(i) - '0';
				
			}
			System.out.println(sum);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
