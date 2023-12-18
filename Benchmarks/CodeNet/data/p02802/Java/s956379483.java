import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int correct = 0;
		int penalty = 0;
		for(int i=0; i<m; i++) {
			int p = in.nextInt();
			String s = in.nextLine().trim();
			//System.out.println(s);
			if(map.containsKey(p)) {
				if(map.get(p)==-1) continue;
				if(s.equals("AC")) {
					correct += 1;
					penalty += map.get(p);
					map.put(p, -1);
					//System.out.println(correct + " A " + penalty);
				}else {
					map.put(p, map.get(p)+1);
					//System.out.println(correct + " B " + penalty);
				}
			}else{
				if(s.equals("AC")) {
					correct += 1;
					map.put(p, -1);
					//System.out.println(correct + " C " + penalty);
				}else {
					map.put(p, 1);
					//System.out.println(correct + " D " + penalty);
				}
			}
		}
		System.out.println(correct + " " + penalty);
	}
}
