import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int l = stdIn.nextInt();
			int r = stdIn.nextInt();
			cnt += r-l+1;
		}
		System.out.println(cnt);
		
	}

}
