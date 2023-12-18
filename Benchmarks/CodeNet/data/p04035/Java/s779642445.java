import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int []data = new int[n];
			int sum = 0;
			for(int i = 0; i < n;i++){
				data[i] = sc.nextInt();
				sum += data[i];
			}
			int start = 0;
			int end = n -1;
			
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0; i< n - 1; i++){
				if(sum < m) break;
					
				if(data[start] <= data[end]){
					sum -= data[start];
					list.add(start + 1);
					start++;
				}
				else{
					sum -= data[end];
					list.add(end );
					end--;
				}
			}
			System.out.println(list.size() > 0 ? "Possible" : "Impossible");
			for(int ans: list){
				System.out.println(ans);
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
