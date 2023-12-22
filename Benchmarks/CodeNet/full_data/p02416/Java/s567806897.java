import java.util.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.next();
			if(s == "0") break;
			int ret = 0;
			for(int i = 0; i < s.length(); i++) ret += s[i] - 48;
			System.out.println(ret);
		}
	}
}