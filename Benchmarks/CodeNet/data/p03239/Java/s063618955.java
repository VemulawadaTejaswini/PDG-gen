import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		int res = 9999;
		for (int i=0;i<n;i++) {
			int ci = sc.nextInt();
			int ti = sc.nextInt();
			if (ti <= t && ci < res) {
				res = ci;
			}
		}
		if (res != 9999) {
			System.out.println(res);
		} else {
			System.out.println("TLE");
		}
	}
}