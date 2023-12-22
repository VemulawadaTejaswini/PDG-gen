import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			long sum = 0;
			for(int i = 0; i < n; i++){
				sum += sc.nextInt();
			}
			System.out.println(n == 0 ? 0 : sum / n);
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}