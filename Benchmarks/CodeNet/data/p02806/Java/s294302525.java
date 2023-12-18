import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		String[] s = new String[N];
		int[] t = new int[N];
		for(int i = 0; i < N; i++) {
			s[i] = stdIn.next();
			t[i] = stdIn.nextInt();
		}
		String X = stdIn.next();
		int ind = 0;
		int sum = 0;
		for(int i = 0; i < N; i++) {
			if(s[i].equals(X)) {
				ind = i;
				break;
			}
		}
		for(int i = ind+1; i < N; i++) {
			sum += t[i];
		}
		
		
		System.out.println(sum);

	}

}