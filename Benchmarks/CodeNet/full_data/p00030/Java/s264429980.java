import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static int count = 0;

	public static void main(String[] args){

		for(;;){
			count = 0;
			int n = scan.nextInt();
			int s = scan.nextInt();
			if(n == 0 && s == 0)break;
			solve(0, n, s);
			System.out.printf("%d\n", count);
		}
	}
	
	// p: ?????\????????°???
	// n: ?????\????????°????????°
	// s: ????¨????????¨????
	private static void solve(int p, int n, int s){
		if(p > 9 || n == 0 || p > s){
			return;
		}
		if(n == 1 && p == s){
			count++;
		}
		solve(p+1, n-1, s-p);
		solve(p+1, n, s);
	}
}