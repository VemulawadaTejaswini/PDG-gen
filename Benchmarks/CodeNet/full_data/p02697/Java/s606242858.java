import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int l = 1, r = N-1;
		for(int i = 0; i < M; i++) {
			System.out.println(l + " " + r);
			l++;
			r--;
		}	
	}

}
