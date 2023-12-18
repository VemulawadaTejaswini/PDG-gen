package atc1;
	import java.util.*;
	public class main {
		public static void main(String args) {
			int cnt = 0;
			Scanner sc = new Scanner(System.in);
			int K = sc.nextInt();
			int S = sc.nextInt();
			for(int i = 0; i < K; i++) {
				for(int j = 0; j < K; j++) {
					for(int k = 0; k < K; k++) {
						if(i + j + k == S) {
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
