import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long count = 0;
		
		for(int i=1; i <= n; i++) {
			count += i * f(i);
		}
		
		System.out.println(count);
	}
	
	static long f(int s) {
		long count=0;
		
		for(int i=1; i <= s; i++) {
			if(s % i == 0) {
				count++;
			}
		}
		
		return count;
	}

}