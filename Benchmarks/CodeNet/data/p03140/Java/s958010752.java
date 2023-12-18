
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		int ans = 0;
		for(int i = 0; i < n; i++){
			ans += check(a.charAt(i), b.charAt(i), c.charAt(i));
		}
		System.out.println(ans);
	}
	
	int check(char a, char b , char c){
		if(a == b && a == c){
			return 0;
		}
		
		if(a == b || a == c || b == c){
			return 1;
		}
		
		return 2;		
	}
}
