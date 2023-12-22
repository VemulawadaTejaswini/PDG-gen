import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String in_str;
			in_str = sc.next();
			if(in_str.equals("#"))
				break;
			boolean[] use = new boolean[26];
			for(int i = 0; i < use.length; i++) use[i] = false;
			ArrayList<String> ans = new ArrayList<String>();
			solve(in_str,0,use,ans);
			System.out.println(ans.size());
			Collections.sort(ans);
			if(ans.size() <= 10) {
				for(int i = 0; i < ans.size(); i++)
					System.out.println(ans.get(i));
			}
			else {
				for(int i = 0; i < 5; i++)
					System.out.println(ans.get(i));
				for(int i = ans.size()-5; i < ans.size(); i++)
					System.out.println(ans.get(i));
			}
		}
	}

	private static void solve(String str, int indx, boolean[] use, ArrayList<String> res) {
		if(indx == str.length()) {
				res.add(str);
			return;
		}
		if(str.charAt(indx) != 'z' && use[(int)(str.charAt(indx)-'a'+1)] == false) {
			use[(int)(str.charAt(indx)-'a'+1)] = true;
			StringBuffer sb = new StringBuffer(str);
			sb.setCharAt(indx,(char)(str.charAt(indx)+1));
			solve(sb.toString(), indx+1, use, res);
			use[(int)(str.charAt(indx)-'a'+1)] = false;
		}
		if(str.charAt(indx) == 'a' || use[(int)(str.charAt(indx)-'a')]) {
			solve(str, indx+1, use, res);
		}
	}
}