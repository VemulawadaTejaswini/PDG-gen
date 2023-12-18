import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();
		int t = sc.nextInt();
		int ans = 10000;
		for(int i=0; i<n; i++){
			int c = sc.nextInt();
			int t2 = sc.nextInt();
			if(t2 <= t){
				ans = Math.min(ans, c);
			}
		}
		if(ans >= 10000){
			System.out.println("TLE");
		}else{
			System.out.println(ans);
		}
	}
}
