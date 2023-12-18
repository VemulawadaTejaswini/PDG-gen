import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			int []s = new int[M];
			int []c = new int[M];
			ArrayList<ArrayList<Integer>> po  = new ArrayList<ArrayList<Integer>>();
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
			
			for(int i = 0;i<N;i++) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				po.add(list);
			}
			boolean owari = false;
			
			for(int i = 0;i<M;i++) {
				s[i] = scan.nextInt();
				c[i] = scan.nextInt();
				
				if(map.containsKey(s[i])&&!map.containsValue(c[i])||s[i]==1&&c[i]==0) {
					owari=true;
				}else {
					map.put(s[i], c[i]);
				}
				
			}
			
		
			
			if(owari) {
				System.out.println(-1);
				return;
			}
			
			
			StringBuffer sb  = new StringBuffer();
			
			for(int i = 0;i<N;i++) sb.append(0);
			
			for(Integer key:map.keySet()) {
				sb.replace(key-1, key, String.valueOf(map.get(key)));
			}
			
			if(sb.toString().substring(0,1).equals("0"))
				sb.replace(0, 1, "1");
			
			
			System.out.println(sb.toString());
			
			
		
			
			
			
		}
		
		
	}
		

}
