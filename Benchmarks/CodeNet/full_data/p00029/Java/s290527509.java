import java.util.*;


public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0029();
	}
	
	class AOJ0029{
		public AOJ0029() {
			String input[] = in.nextLine().split(" ");
			HashMap<String,Integer> map = new HashMap<String, Integer>();
			int max = Integer.MIN_VALUE;
			int result_index = 0;
			for(int i=0;i<input.length;i++){
				if(max<input[i].length()){
					max = input[i].length();
					result_index = i;
				}
				if(!map.containsKey(input[i]))map.put(input[i], 0);
				map.put(input[i], map.remove(input[i])+1);
			}
			max = Integer.MIN_VALUE;
			String result2 = "";
			for(String key:map.keySet()){
				if(max<map.get(key)){
					result2 = key;
					max = map.get(key);
				}
			}
			System.out.println(result2+" "+input[result_index]);
		}
	}

}