import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			List<String> atcg = new ArrayList<String>();
			atcg.add("A");
			atcg.add("T");
			atcg.add("C");
			atcg.add("G");
			String []s = sc.next().split("");
			int len = 0;
			int max = 0;
			for(int i = 0;i<s.length;i++) {
					if(atcg.contains(s[i])) {
						len++;
						if(len>max) {
							max = len;
						}
					}
					else 
						len = 0;
			}
			System.out.println(max);
			sc.close();
			
		}
	public static void main(String[] args) {
		solve();

	}

}
