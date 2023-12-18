import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int K = Integer.parseInt(scn.next());
		int S = Integer.parseInt(scn.next());
		int cnt = 0;
		
		for(int i = 0; i <= K; i++) {
			for(int j = 0; j <= K; j++) {
				for(int l = 0; l <= K; l++) {
					if(i+j+l == S) cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}
}