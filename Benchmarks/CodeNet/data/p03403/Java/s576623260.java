import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			int [] calc = new int[n+1];
			int prev = 0, sum = 0;
			for(int i = 0; i < n+1; i++){
				int num = 0;
				if(i < n){
					num = data[i];
				}
				
				calc[i] = Math.abs(num - prev);
				prev = num;
				sum += calc[i];
			}
			int [] calc2 = new int[n];
			prev = 0;
			for(int i = 0; i < n; i++){
				int num = 0;
				if(i+1 < n){
					num = data[i+1];
				}
				
				calc2[i] = Math.abs(num - prev);
				prev = data[i];
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i++){
				sb.append(sum - calc[i] - calc[i+1] + calc2[i] + "\n");
			}
			System.out.print(sb.toString());

		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
