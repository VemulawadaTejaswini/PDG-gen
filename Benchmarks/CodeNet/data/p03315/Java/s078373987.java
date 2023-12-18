import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int ans = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '+') ans++;
			else ans--;
		}
		
		System.out.println(ans);		
	}
}