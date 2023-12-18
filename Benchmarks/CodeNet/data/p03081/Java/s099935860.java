
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		int q = sc.nextInt();

		char[] s = sc.next().toCharArray();

		int lost = 0;
		Map<Character,LinkedList<Integer>> leftMap = new HashMap<Character,LinkedList<Integer>>();
		Map<Character,LinkedList<Integer>> rightMap = new HashMap<Character,LinkedList<Integer>>();
		
		for(int i = 0 ; i < n;i++) {
			leftMap.computeIfAbsent(s[i], key -> new LinkedList<Integer>()).addLast(i);
			rightMap.computeIfAbsent(s[i], key -> new LinkedList<Integer>()).addFirst(i);;
		}
		
		int count[] = new int[n];
		Arrays.fill(count, 1);
		for(int i = 0 ; i < q; i++) {
			char t = sc.next().charAt(0);
			boolean r = sc.next().charAt(0) == 'R'; 
			boolean l = !r;
			
			if(r) {
				if(rightMap.containsKey(t)) {
					for(int id: rightMap.get(t)) {
						if(id == n-1) {
							lost += count[id];
							count[id] = 0;
						}else {
							count[id+1] += count[id];
							count[id] = 0;
						}
					}
				}				
			}
			if(l) {
				if(leftMap.containsKey(t)) {
					for(int id: leftMap.get(t)) {
						if(id == 0) {
							lost += count[id];
							count[id] = 0;
						}else {
							count[id-1] += count[id];
							count[id] = 0;
						}
					}
				}
			}
		}
		
		System.out.println(n-lost);
	}
}