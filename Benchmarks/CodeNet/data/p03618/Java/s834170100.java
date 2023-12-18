import java.util.*;


public class Main {
	int MOD = 1000000007;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			char [] data = s.toCharArray();
			int n = data.length;
			
			long sum = (long)n * (n - 1) / 2 + 1;
			ArrayList<ArrayList<Integer>> list = new ArrayList<>();
			for(int i = 0; i < 26;i++){
				list.add(new ArrayList<>());
			}
			for(int i = 0; i < n; i++){
				list.get(data[i] - 'a').add(i);
			}
			
			long count = 0;
			for(int i = 0; i < 26; i++){
				int size = list.get(i).size();
				if(size < 2)continue;
				long calc = size * (size - 1) / 2;
				
				count += calc;
			}
			System.out.println(sum - count);
		}
	}



	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
