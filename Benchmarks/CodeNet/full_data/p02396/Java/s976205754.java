
import java.util.Scanner;

public class Main {
	void testcase(){
		Scanner s = new Scanner(System.in);
		int tmp;
		int cnt = 1;
		tmp = s.nextInt();
		while(tmp != 0){
			System.out.println("Case " + cnt + ": " + tmp);
			tmp = s.nextInt();
			cnt++;
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.testcase();
	}
}