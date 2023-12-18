
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		
		char[] s = sc.next().toCharArray();
		int n = s.length;
		int w = 0;
		int b = 0;
		
		for(int i = 0; i < n; i++){
			if(s[i] == 'W'){
				w++;
			}else{
				b++;
			}
		}
		
		int sum = 0;		
		for(int i = 0; i < n; i++){
			if(s[i] == 'B'){
				sum += w;
			}else{
				w--;
			}
		}
		
		System.out.println(sum);
	}
}
