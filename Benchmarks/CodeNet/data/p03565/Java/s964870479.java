import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sFake = sc.next();
		String t = sc.next();
		String ans = "";
      boolean b = false;
		for(int i = sFake.length() - 1 ; i > t.length() - 2 ; i--) {
			String s = sFake.substring(i - t.length() + 1, i + 1);
			if(canReplace(s , t)) {
              b = true;
				for(int j = 0 ; j < sFake.length() ; j++) {
					if(j < i - t.length() + 1 || j > i) {
						ans += sFake.charAt(j) == '?' ? "a" : sFake.charAt(j);
					}
					else {
						ans += t.charAt(j - i + t.length() - 1);
					}
				}
				break;
			}
		}
      if(!b){
        System.out.println("UNRESTORABLE");
        return;
      }

		sc.close();
		System.out.println(ans);

	}
	public static boolean canReplace(String s , String t) {
		for(int i = 0 ; i < t.length() ; i++) {
			if(s.charAt(i) != '?') {
				if(s.charAt(i) != t.charAt(i))
					return false;
			}

		}
		return true;

	}
}

