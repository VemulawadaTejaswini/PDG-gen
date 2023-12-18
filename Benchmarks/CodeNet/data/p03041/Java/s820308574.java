
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		
		char ch[] = s.toCharArray();
		
		ch[k-1] = (char)(ch[k-1] - 'A'+'a');
		
		System.out.println(ch);
	}
}
