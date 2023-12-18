import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int []data = new int[n];
			long sum = 0;
			for(int i = 0; i < n;i++){
				data[i] = sc.nextInt();
				sum += data[i];
			}
			int start = 0;
			int end = n -1;
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i< n - 1; i++){
				if(sum < m) break;
					
				if(data[start] <= data[end]){
					sum -= data[start];
					sb.append("\n" + (start + 1));
					start++;
				}
				else{
					sum -= data[end];
					sb.append("\n" + end );
					end--;
				}
			}
			System.out.println(sb.length() > 0 ? "Possible" : "Impossible");
			if(sb.length() > 0){
				System.out.println(sb.substring(1));
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
