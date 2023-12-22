import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int l = 1, r = N;
		int ok = 0;
		for(int i = 0; i < M; i++) {
			System.out.println(l + " " + r);
			l++;
			if(ok == 0) {
				r -= 2;
				ok++;
			}
			else if(ok == 1) {
				r--;
				ok++;
			}
			else {
				r += 3;
				ok = 0;
			}
		}	
	}

}