import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			ArrayList<Integer> data = new ArrayList<>();
			HashMap<Integer, Long> map = new HashMap<>();
			for(int i = 0; i < n;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(map.containsKey(a)){
					map.put(a, map.get(a) + b);
				}
				else{
					map.put(a, (long) b);
					data.add(a);
				}
			}
			Collections.sort(data);
			
			long sum = 0;
			for(int ind: data){
				long val = map.get(ind);
				sum += val;
				if(sum >= k){
					System.out.println(ind);
					break;
				}
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
