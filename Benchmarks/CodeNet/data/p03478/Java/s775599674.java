import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i=1 ; i<=n ; i++) {
			if(check(i,a,b)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	static boolean check(int n,int a,int b) {
		int sum=0;
		while(n != 0) {
			sum += (n%10);
			n /= 10;
		}
		if(sum >= a && sum <= b) {
			return true;
		}else {
			return false;
		}
	}
}
