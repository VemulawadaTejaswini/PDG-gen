import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			if(n == 0) break;
			System.out.println(ten(n));
		}
		sc.close();
	}
	
	
	static int dev(int n, int dev) {
		int result = 0;
		int m = n;
		while(m % dev == 0) {
			result++;
			m = m / dev;
		}
		return result;
	}
	
	static int ten(int n) {
		int two = 0;
		int five = 0;
		for(int i = 1; i <= n; i++) {
			two += dev(i, 2);
			five += dev(i, 5);
		}
		return two < five? two: five;
	}
	
}