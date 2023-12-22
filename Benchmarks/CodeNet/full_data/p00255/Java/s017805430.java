import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	private void doit(){
		while(true){
			int n = sc.nextInt();
			if (n == 0) break;
			long sum = 0;
			for(int i = 0; i < n; i++){
				sum += sc.nextInt();
			}
			int [] data = new int[n-1];
			for(int i =0; i < n-1; i++){
				data[i] = sc.nextInt();
			}
			Arrays.sort(data);
			long max = 0;
			
			for(int i = 1; i < n; i++){
				max = Math.max(max,sum * (n - i + 1));
				sum += data[n-1-i];
			}
			max = Math.max(max, sum);
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