import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int N = Integer.parseInt(str);
			int[] score = new int[N];
			int total = 0;
			for(int i =0;i<N;i++) {
				str = br.readLine();
				int s = Integer.parseInt(str);
				total += s;
				score[i] = s;
			}
			Arrays.sort(score);
			for(int i = 0;i < N;i++) {
				if(total % 10 != 0) {
					System.out.println(total);
					break;
				}else {
					total -= score[i];
				}
				if(i==N-1) {
					System.out.println(0);
				}
			}
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}
}