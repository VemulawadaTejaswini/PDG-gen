import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		System.out.println(solve(s));
	}
	static String solve(String s){
		String[][] str = {{"SSS", "WSW", "SWW", "WWS"}, {"SSW", "WSS", "SWS", "WWW"}};
		int idx = -1;
		if(s.charAt(0)=='o')
			idx = 0;
		else
			idx = 1;
		
		for(int i=0;i<4;i++){
			String ans = str[idx][i];
			for(int j=1;j<s.length();j++){
				ans+=addStr(s.charAt(j), ans.substring(ans.length()-2));
			}
			
			if(isCorrect(ans)){
				return ans.substring(1, ans.length()-1);
			}
		}
		return "-1";
	}
	static String addStr(char c, String str){
		if(c=='o'){
			if(str.equals("SS"))
				return "S";
			if(str.equals("WS"))
				return "W";
			if(str.equals("SW"))
				return "W";
			if(str.equals("WW"))
				return "S";
		}
		else{
			if(str.equals("SS"))
				return "W";
			if(str.equals("WS"))
				return "S";
			if(str.equals("SW"))
				return "S";
			if(str.equals("WW"))
				return "W";
		}
		return "";
	}
	static boolean isCorrect(String s){
		int len = s.length();
		if(s.charAt(0)==s.charAt(len-2) && s.charAt(1)==s.charAt(len-1))
			return true;
		else
			return false;
	}
}
