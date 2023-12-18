import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		Set<String> sets = new HashSet<String>();
		Set<String> sett = new HashSet<String>();
		String s = sc.next();
		String t = sc.next();
		int len = s.length();
		for(int i = 0; i < len; i++) {
			String ssub = s.substring(i, i + 1);
			String tsub = t.substring(i, i + 1);
			if(sets.add(ssub) != sett.add(tsub)) {	
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
