import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

class Main{
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		while(true){
			String str = sc.nextLine();
			if(str.equals("")){
				break;
			}
			
			String[] ss = str.split(",");
			int num = Integer.parseInt(ss[0]);
			if(map1.containsKey(num)){
				map1.put(num, map1.get(num)+1);
			}else{
				map1.put(num, 1);
			}
		}
		
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		while(sc.hasNext()){
			String str = sc.next();
			if(str.equals("")){
				break;
			}
			
			String[] ss = str.split(",");
			int num = Integer.parseInt(ss[0]);
			if(map2.containsKey(num)){
				map2.put(num, map2.get(num)+1);
			}else{
				map2.put(num, 1);
			}
		}
		
		for(Iterator ite = map1.keySet().iterator(); ite.hasNext(); ){
			int num = (Integer)ite.next();
			if(map2.containsKey(num)){
				System.out.println(num + " " + (map1.get(num) + map2.get(num)));
			}
		}
		
	}
	
	public static void main(String[] args){
		new Main().solve();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}