import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		String s = sc.next();
		
		int answer = 0;
		for(int i=0; i<4; i++) {
			char symbol = s.charAt(i);
			
			if(symbol == '+') {
				answer++;
			} else {
				answer--;
			}
		}
		
		System.out.println(answer);
	}
}
