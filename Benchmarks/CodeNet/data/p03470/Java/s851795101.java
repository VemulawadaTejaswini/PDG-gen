import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[]d = new int[n];
		for(int i = 0; i < n; i++) {
			d[i] = stdIn.nextInt();
		}
		
		Arrays.sort(d);
		int cnt = 1;
		for(int i = 0; i < n-1; i++) {
			if(d[i]!=d[i+1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
