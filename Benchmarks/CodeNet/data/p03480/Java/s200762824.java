import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		int max = 0;
		for(char c : s.toCharArray()) {
			if(c=='1') {
				count++;
			} else {
				if(count > max) {
					max = count;
				}
				count = 0;
			}
		}
		if(count > max) {
			max = count;
		}
		System.out.println(s.length()-max);
	}
}