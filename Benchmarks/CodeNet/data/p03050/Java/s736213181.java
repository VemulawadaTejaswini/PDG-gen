import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			long N = sc.nextLong();
		sc.close();

		long answer = 0;;
		int sq = (int)Math.sqrt(N);
		//System.out.println(sq);
		for(int i = 1 ; i <= sq ; i++){
			long p = N/i;

			//System.out.println(p);
			if(N%p == 0 && p != sq && N%(p-1) != 0){
				answer += p-1;
			}
		}

		System.out.println(answer);
	}
}
