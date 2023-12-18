import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		long B = 1007;
		long MOD = 1000000007;
		
		long[][] hash = new long[N/2+1][N];
		Arrays.fill(hash[0], 1);
		for(int i=0; i<N; i++) {
			for(int j=0; j<N/2 && i+j<N; j++) {
				hash[j+1][i] = (hash[j][i]*B+(s[i+j]-'a'))%MOD;
			}
		}
		
		for(int i=N/2; i>=0; i--) {
			HashSet<Long> set = new HashSet<>();
			for(int j=i; j<=N-i; j++) {
				set.add(hash[i][j-i]);
				if(set.contains(hash[i][j])) {
					System.out.println(i);
					sc.close();
					return;
				}
			}
		}
		
		sc.close();
	}
}

