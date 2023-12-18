import java.util.*;
// warm-up
// Definitely dont care about "Harshad" number. Nor Erdos nor bacon
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		String tok = sc.next();
		for (char ch : tok.toCharArray()) s+=Character.getNumericValue(ch);
		System.out.println(Integer.parseInt(tok)%s==0 ? "Yes" : "No");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}