import java.util.*;


public class Main {
	
	Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Main().run(); 
	}
	
	public void run() {		
		
		/*input*/
		
		String input = cin.nextLine();
		
		/*start*/
		
		int n = input.length();
		
		Map<Character, Integer> map;
		
		for (int i = 0; i < n-1; i ++) {
			
			map = new HashMap<>();
			
			map.put(input.charAt(i), 1);
			int count = 1;
			int all = 0;
			
			for (int j = i + 1; j < n; j ++) {
				
				char ch = input.charAt(j);
				map.put(ch, map.getOrDefault(ch, 0) + 1);
				count = Math.max(count, map.get(ch));
				all = j - i + 1;
				
				if (count > all/2) {
					i ++;
					j ++;
					System.out.println(i +" " + j);
					return;
				}
			}
		}
		
		/*finish
		 * no such substring*/
		System.out.println("-1 -1");
	}
}

