import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main solution = new Main();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String ans = solution.decision(input);
		
		System.out.println(ans);
		scanner.close();
	}
	
	
	public String decision(String input) {
		String res = "No";
		int count = 0;
		
		for (int i = 0; i < input.length()-1; i++) {
			String s = input.substring(i, i+1);
			String next = input.substring(i+1,i+2);
			if (s.equals(next)) {
				count++;
				if (count>=2) {
					res="Yes";
					}
			}else{
				count=0;
			}
		}
		return res;
	}
}
