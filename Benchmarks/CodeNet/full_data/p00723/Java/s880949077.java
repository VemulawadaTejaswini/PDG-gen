import java.util.*;
public class Main {
	Scanner sc;
	
	String revStr(String str) {
		
		String ret = "";
		for(int j=str.length()-1;j>=0;j--) {
			ret += str.charAt(j);
		}
		return ret;
	}
	boolean rev1[] = {false,true,true,true};
	boolean rev2[] = {false,true,false,true};
	void run() {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			String str = sc.next();
			HashSet<String> strs = new HashSet<String>();
			for(int j=1;j<str.length();j++) {
				String sp1 = str.substring(0, j);
				String sp2 = str.substring(j);
				
				for(int k=0;k<4;k++) {
					if(rev1[k]) sp1 = revStr(sp1);
					if(rev2[k]) sp2 = revStr(sp2);
					strs.add(sp1.concat(sp2));
					strs.add(sp2.concat(sp1));
				}
			}
			System.out.println(strs.size());
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}