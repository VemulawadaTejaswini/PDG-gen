import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		String S = stdIn.next();
		char[] s = S.toCharArray();
		long sum = 0;
		int out = 0;
		int in = 0;
		
		if(s[0] == 'R' && s[1] == 'R') sum++;
		else if(s[0] == 'L' && s[1] == 'R') out++;
		else if(s[0] == 'R' && s[1] == 'L') in++;
		
		if(s[N-1] == 'L' && s[N-2] == 'L') sum++;
		for(int i = 1; i < N-1; i++) {
			if(s[i] == 'L' && s[i-1] == 'L') sum++;
			else if(s[i] == 'R' && s[i+1] == 'R') sum++;
			
			if(s[i] == 'L' && s[i+1] == 'R') out++;
			else if(s[i] == 'R' && s[i+1] == 'L') in++;
		}
		
		if(Math.min(out,in) >= K) {
			sum += K*2;
		}
		else {
			sum += Math.min(out,in)*2;
			if(out == in);
			else if(K-Math.min(out,in) == 1 || Math.max(out,in)-Math.min(out,in) == 1) {
				if(Math.max(out,in) == out && (s[0] == 'L' || s[N-1] == 'R')) sum++;
				else if(Math.max(out,in) == in && (s[0] == 'R' || s[N-1] == 'L')) sum++;
			}
			else {
				if(Math.max(out,in) == out) {
					if(s[0] == 'L')sum++;
					if(s[N-1] == 'R')sum++;
				}
				else if(Math.max(out,in) == in && s[0] == 'R') {
					if(s[0] == 'R')sum++;
					if(s[N-1] == 'L')sum++;
				}
			}
		}
		
		System.out.println(sum);

	}

}