import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String v = "aeiou";
		System.out.println(v.indexOf(sc.next().charAt(0))==-1 ? "consonant" : "vowel");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}