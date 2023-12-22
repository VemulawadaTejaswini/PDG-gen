import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Map <String, ArrayList<Integer>>map = new HashMap <String, ArrayList<Integer>>();
	static PriorityQueue<String> queue = new PriorityQueue<String>();
	static String word;
	static int page;
	public static void main(String[] args) {
		while(read()){
			
		}
		solve();
	}

	static boolean read(){
		if(!sc.hasNext())return false;
		word = sc.next();
		page = sc.nextInt();
		if(map.containsKey(word)){
			map.get(word).add(page);
		}else{
			queue.add(word);
			ArrayList<Integer>list = new ArrayList<Integer>();
			list.add(page);
			map.put(word, list);
		}
		return true;
	}
	
	static void solve(){
		while(!queue.isEmpty()){
			String w = queue.poll();
			ArrayList<Integer>list = map.get(w);
			System.out.println(w);
			Collections.sort(list);
			boolean flag = true;
			for(int i : list){
				if(!flag)System.out.print(" ");
					flag = false;
					System.out.print(i);
			}
			System.out.println();
		}
	}
}