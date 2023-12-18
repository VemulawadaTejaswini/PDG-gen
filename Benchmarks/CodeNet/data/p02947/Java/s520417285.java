import java.util.*;

public class Main {
	double EPS = 10.e-08;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [][] data = new int[n][26];
			
			for(int i = 0; i < n; i++){
				String s = sc.next();
				for(int j = 0 ; j < s.length(); j++){
					data[i][s.charAt(j) - 'a']++;
				}
			}
			
			HashMap<String, Integer> map = new HashMap<>();
			for(int i = 0; i < n; i++){
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < 26; j++){
					sb.append(" " + data[i][j]);
				}
				
				if(map.containsKey(sb.toString())){
					map.put(sb.toString(), map.get(sb.toString()) + 1);
				}
				else {
					map.put(sb.toString(), 1);
				}
			}
			
			long count = 0;
			for(String key: map.keySet()) {
				long current =  map.get(key);
				count += current * (current - 1) / 2;
			}
			
			System.out.println(count);
			
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
