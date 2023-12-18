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
			//System.out.println(sets.toString() + "\n" + sett.toString());
			//System.out.println(ssub + " " + tsub);
			if(sets.add(ssub) != sett.add(tsub)) {	
				System.out.println("No");
				//System.out.println(ssub + " " + tsub);
				return;
			}
		}
		String as[] = new String[sets.size()];
		sets.toArray(as);
		String at[] = new String[sett.size()];
		sett.toArray(at);
		//System.out.println(at);
		//System.out.println(sets.size());
		for(int i = 0; i < as.length; i++) {
			if(sett.contains(as[i]))continue;
			if(sets.contains(at[i])) {
				System.out.println("No");
				return;
				//System.out.println(i + " " + j);
			}
		}
		if(!sets.equals(sett)) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}