import java.util.*;

class Main {
	Scanner sc;
	
	void calc() {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < s.length(); i++)
			ans.append( (char) ((s.charAt(i)-'A'+N)%26+'A') );
		System.out.println(ans.toString());
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}