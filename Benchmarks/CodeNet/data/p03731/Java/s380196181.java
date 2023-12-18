import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int T = sc.nextInt();
		int []t = new int [n+1];
		int []s = new int [n+1];
		
		t[0] = sc.nextInt();
		for(int i = 1; i < n ; i++) {
			t[i] = sc.nextInt();
			s[i - 1] = t[i] - t[i - 1];
		}
		int sum = 0;
		for(int i = 0; i < n ;i++) {
			if(T >= s[i]) {
				sum += s[i];
				
			}
			if(T < s[i]) {
				sum += T;
			}
		}
		System.out.println(sum + T);

	}

}
