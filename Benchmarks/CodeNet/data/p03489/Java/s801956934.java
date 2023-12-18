import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			HashMap<Integer, Integer> map = new HashMap<>();
			for(int i =0; i < n; i++){
				data[i] = sc.nextInt();
				if(map.containsKey(data[i])){
					map.put(data[i], map.get(data[i]) + 1);
				}
				else{
					map.put(data[i], 1);
				}
			}
			int sum = 0;
			for(int key: map.keySet()){
				int value = map.get(key);
				if(value >= key){
					sum += value - key;
				}
				else{
					sum += value;
				}
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
