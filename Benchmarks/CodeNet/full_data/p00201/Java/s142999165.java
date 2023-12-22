import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0201();
	}

	class AOJ0201{
		HashMap<String, ArrayList<String>> map;
		HashMap<String, Integer> price;
		
		int bfs(String target){
			int a = Integer.MAX_VALUE;
			int b = 0;
			if(price.containsKey(target))a=price.get(target);
			if(map.containsKey(target)==false)return a;
			ArrayList<String> list = map.get(target);
			for(int i=0;i<list.size();i++)if(map.containsKey(list.get(i))||price.containsKey(list.get(i))){
				b += bfs(list.get(i));
			}
			return Math.min(a, b);
		}
		
		public AOJ0201() {
			while(true){
				map = new HashMap<String, ArrayList<String>>();
				price = new HashMap<String, Integer>();
				int n = in.nextInt();
				if(n==0)break;
				for(int i=0;i<n;i++)price.put(in.next(),in.nextInt());
				int list_n = in.nextInt();
				for(int i=0;i<list_n;i++){
					String name = in.next();
					ArrayList<String> list;
					if(!map.containsKey(name))list = new ArrayList<String>();
					else list = map.get(name);
					int a = in.nextInt();
					for(int s=0;s<a;s++)list.add(in.next());
					map.put(name,list);
				}
				System.out.println(bfs(in.next()));
			}
		}
	}
}