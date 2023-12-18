import java.util.*;

class Main{
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int S = scan.nextInt();

		int answer = 0;
		for(int x = 0; x <= K; x++) {
			for(int y = 0; y <= K; y++) {
				if(S-x-y<=K) answer++;
			}
		}
		System.out.println(answer);
	}
}
