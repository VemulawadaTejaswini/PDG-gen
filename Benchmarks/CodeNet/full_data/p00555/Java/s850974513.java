import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static HashMap<String,String> map = new HashMap<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int D = sc.nextInt();
		
		boolean[][] map = new boolean[N][M];
		for(int i = 0; i < N; i++) {
			char[] in = sc.next().toCharArray();
			for(int j = 0; j < M; j++) {
				if(in[j] != '#') map[i][j] = true;
			}
		}
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int cc = 0;
			for(int j = 0; j < M; j++) {
				if(map[i][j]) cc++;
				
				if(!map[i][j] || j == M-1) {
					ans += Math.max(0, cc - D + 1);
					cc = 0;
				}
			}
		}
		for(int i = 0; i < M; i++) {
			int cc = 0;
			for(int j = 0; j < N; j++) {
				if(map[j][i]) cc++;
				
				if(!map[j][i] || j == N-1) {
					ans += Math.max(0, cc - D + 1);
					cc = 0;
				}
			}
		}
		System.out.println(ans);
	}
}