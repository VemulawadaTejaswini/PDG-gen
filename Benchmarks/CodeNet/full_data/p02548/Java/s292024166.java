import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = 0;
		for (int a = 1; a < n; a++) {
			for (int b = 1; a * b < n; b++) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}

