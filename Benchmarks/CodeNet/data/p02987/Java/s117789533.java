
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			m.put(c-'A', m.containsKey(c-'A') ? m.get(c-'A')+1 : 1);
		}
		if(m.size()!=2) {
			System.out.println("No");
			sc.close();
			return;
		}else {
			for(Map.Entry<Integer, Integer> e : m.entrySet()) {
				if(e.getValue() != 2) {
					System.out.println("No");
					sc.close();
					return;
				}
			}
		}
		System.out.println("Yes");
		sc.close();
	}
}
