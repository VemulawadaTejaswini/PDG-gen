import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String alps = "abcdefghijklmnopqrstuvwxyz";
		for (char ch : sc.next().toCharArray()) if (alps.indexOf(ch)!=-1) alps = alps.replaceAll(""+ch,"");
		System.out.println(alps.length()==0 ? "None" : alps.charAt(0));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}