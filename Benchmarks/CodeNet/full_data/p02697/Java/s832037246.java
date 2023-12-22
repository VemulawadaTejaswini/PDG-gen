import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if(M % 2 == 1) {
			int l = 1, r = M/2;
			for(int i = 0; i < M/2; i++) {
				System.out.println(l + " " + r);
				l++;
				r--;
			}
			l = (M+1)/2;
			r = N;
			for(int i = 0; i < (M+1)/2; i++) {
				System.out.println(l + " " + r);
				l++;
				r--;
			}
		}
		else {
			int l = 1, r = (M+1)/2;
			for(int i = 0; i < M/2; i++) {
				System.out.println(l + " " + r);
				l++;
				r--;
			}
			l = (M+1)/2+1;
			r = N;
			for(int i = 0; i < M/2; i++) {
				System.out.println(l + " " + r);
				l++;
				r--;
			}
		}

	}

}