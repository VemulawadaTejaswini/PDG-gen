
import java.util.*;
public class Main {
	// 2307 start
	//2322 TLE
	
	HashMap<String, HashSet<String>> data;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			String first = null;
			data = new HashMap<String, HashSet<String>>();
			for(int i = 0; i < n; i++){
				String [] input = sc.next().replaceAll("\\.", "").split(":");
				HashSet<String> s = new HashSet<String>();
				String [] mem = input[1].split(",");
				for(int j = 0; j <  mem.length; j++){
					s.add(mem[j]);
				}
				data.put(input[0], s);
				if(i == 0){
					first = input[0];
				}
			}
			HashSet<String> res = solve(first);
			
			System.out.println(res.size());
			//debug
			
//			for(String s : data.keySet()){
//				System.out.println("debug " + s + " " + Arrays.toString(data.get(s)));
//			}
//			System.out.println("-----");
		}
	}

	private HashSet<String> solve(String str) {
		
		if(data.containsKey(str)){
			HashSet<String> now = data.get(str);
			HashSet<String> res = new HashSet<String>();
			for(String key : now){
				res.addAll(solve(key));
			}
			data.put(str, res);
			return res;
		}
		else{
			HashSet<String> now = new HashSet<String>();
			now.add(str);
			return now;
		}
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}