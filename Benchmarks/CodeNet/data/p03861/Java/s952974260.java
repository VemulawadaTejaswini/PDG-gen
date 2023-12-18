import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long i,ans = 0;
		for(i = a; i <= b; i++){
			if(i / x == 0){
				ans++;
			}
		}
		System.out.println(ans);
	}
}