import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int [] data = new int[n];
			HashMap<Integer, Integer> map = new HashMap();
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
				if(map.containsKey(data[i])){
					map.put(data[i], map.get(data[i]) + 1);
				}
				else{
					map.put(data[i], 1);
				}
			}
			ArrayList<Integer[]> data2 = new ArrayList<>();
			for(int key: map.keySet()){
				data2.add(new Integer[]{key, map.get(key)});
			}
			Collections.sort(data2, new Comparator<Integer[]>() {
				@Override
				public int compare(Integer[] o1, Integer[] o2) {
					if(o1[1] < o2[1]) return -1;
					if(o1[1] > o2[1]) return 1;
					return 0;
				}
			});
			long sum = 0;
			for(int i = 0 ; i < Math.max(data2.size() - k, 0); i++){
				sum += data2.get(i)[1];
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
