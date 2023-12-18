import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		int D = 0;
		int ans = 0;
		if(d == 0) {
			D=1;
		}else if(d == 1) {
			D=100;
		}else if(d == 2) {
			D=10000;
		}
		for(int i=0 ; i<n ; i++) {
			ans += D;
		}
		System.out.print(ans);
	}

}
