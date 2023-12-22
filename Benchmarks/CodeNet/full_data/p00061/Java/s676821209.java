import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;


public class Main{
	Scanner sc;
	
	void solve(){
		sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		while(true){
			String str[] = sc.next().split(",");
			
			int num = Integer.parseInt(str[0]);
			int res = Integer.parseInt(str[1]);
			if(num == 0 && res == 0)break;
			
			map.put(num, res);
		}
		
		Integer[] list = new Integer[map.size()];
		Arrays.fill(list, 0);
		map.values().toArray(list);
		Arrays.sort(list);
		
		HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();
		int num = 0;
		for(int i=list.length-1; 0<=i; --i){
			if(rank.containsKey(list[i])){
			}else{
				rank.put(list[i], ++num);
			}
		}
		
		while(sc.hasNext()){
			System.out.println(rank.get(map.get(ni())));
		}
		
		sc.close();
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	public static void main(String[] args){
		new Main().solve();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}