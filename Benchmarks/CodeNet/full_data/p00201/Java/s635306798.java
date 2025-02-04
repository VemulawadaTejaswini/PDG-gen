import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			ArrayList<String> names = new ArrayList<String>();
			int[] prices = new int[n];
			for(int i = 0; i < n; i++){
				names.add(sc.next());
				prices[i] = sc.nextInt();
			}
			
			final int m = sc.nextInt();
			
			Map<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
			Map<String, HashSet<String>> map_err = new HashMap<String, HashSet<String>>();
			for(int i = 0; i < m; i++){
				int from = 0;
				String fo = sc.next();
				{
					int count = 0;
					
					for(String name : names){
						if(name.equalsIgnoreCase(fo)){
							break;
						}else{
							count++;
						}
					}
					
					from = count;
				}
				
				final int num = sc.nextInt();
				
				HashSet<Integer> set = new HashSet<Integer>(num);
				HashSet<String> set_err = new HashSet<String>(num);
				
				for(int j = 0; j < num; j++){
					final String in = sc.next();
					int count = 0;
					
					for(String name : names){
						if(name.equalsIgnoreCase(in)){
							break;
						}else{
							count++;
						}
					}
					
					set.add(count);
					set_err.add(in);
				}
				
				map.put(from, set);
				map_err.put(fo, set_err);
			}
			
			boolean updated = false;
			for(int i = 0; i < m; i++){
				for(Map.Entry<Integer, HashSet<Integer>> entry : map.entrySet()){
					int sum = 0;
					for(int p : entry.getValue()){
						try{
							sum += prices[p];
						}catch(ArrayIndexOutOfBoundsException e){
							//throw new RuntimeException(names + "\n" + map_err + "\n" + names.get(entry.getKey()));
						}
					}
					
					if(prices[entry.getKey()] > sum){
						prices[entry.getKey()] = sum;
						updated = true;
					}
				}
				
				if(!updated){
					break;
				}else{
					updated = false;
				}
			}
			
			final String out = sc.next();
			int count = 0;
			for(String str : names){
				if(str.equalsIgnoreCase(out)){
					break;
				}else{
					count++;
				}
			}
			
			System.out.println(prices[count]);
		}
		
	}

}