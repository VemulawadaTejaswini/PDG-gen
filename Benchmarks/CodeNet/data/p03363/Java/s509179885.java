import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n;i++){
				data[i] = sc.nextInt();
			}
			long [] acc = new long[n];
			acc[0] = data[0];
			for(int i = 1; i < n; i++){
				acc[i] = acc[i-1] + data[i];
			}
			
			HashMap<Long, Integer> map = new HashMap<>();
			map.put(0L, 1);
			for(int i = 0; i < n; i++){
				if(map.containsKey(acc[i])){
					map.put(acc[i], map.get(acc[i]) + 1);
				}
				else{
					map.put(acc[i], 1);
				}
			}
			long sum = 0;
			for(Long key: map.keySet()){
				long value = map.get(key);
				sum += value * (value-1) / 2;
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
