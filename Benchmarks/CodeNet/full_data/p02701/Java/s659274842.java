import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 1;
		String[] s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
			for(int m = 0; m < i; m++) {
				if(s[i].contentEquals(s[m])) {
					break;
				}
				if(m == i -1) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
	
}
