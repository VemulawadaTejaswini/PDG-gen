import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int ac = 0;
		int[] wa = new int[n];
		int wawa = 0;

		TreeMap<Integer, String> ans = new TreeMap<>();

		for (int i = 0; i < m; i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if (ans.containsKey(p)) {
				if (ans.get(p).equals("AC")) {
					continue;
				} else {
					ans.put(p, s);
					if (s.equals("AC")) {
						ac++;
						continue;
					} else if(s.equals("WA")){
						wa[p-1]++;
						continue;
					}
				}
			} 
			ans.put(p, s);
				if (s.equals("AC")) {
					ac++;
				} else if(s.equals("WA")){
					wa[p-1]++;
				}
			}
		
		System.out.println(ac);
		for(Integer key : ans.keySet()) {
			if(ans.get(key).equals("AC")) {
				wawa = wawa + wa[key-1];
			}
		}
		
		System.out.println(wawa);
		

		}
}