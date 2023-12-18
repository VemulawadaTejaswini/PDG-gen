import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        String a = "";
		ArrayList<String> ans = new ArrayList<String>();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '0') {
				ans.add("0");
			}else if(s.charAt(i) == '1') {
				ans.add("1");
			}else if(s.charAt(i) == 'B' && ans.size() != 0) {
				ans.remove(ans.size() -1);
			}
		}
		for(String ss : ans) {
			a += ss;
		}
      System.out.println(a);
	}
}
