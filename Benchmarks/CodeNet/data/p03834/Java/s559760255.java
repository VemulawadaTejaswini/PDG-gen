import java.util.*;

public class Main {
	
	private void doit(){
		
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			
			String s = sc.next();
			System.out.println(s.replaceAll(",", " "));
		}

	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
