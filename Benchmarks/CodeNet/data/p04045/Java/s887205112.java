import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String N;
		int K;

		N = sc.next();
		K = Integer.parseInt(sc.next());

		int D[] = new int[K];

		for(int i = 0; i < K; i++){
			D[i] = Integer.parseInt(sc.next());
		}

		while(distinct(N, D, K)){
			int n = Integer.parseInt(N);
			n++;
			N = String.valueOf(n);
		}

		System.out.println(N);
	}

	public static boolean distinct(String S, int D[], int K){
		for(int i = 0; i < S.length(); i++){
			int s = Character.getNumericValue(S.charAt(i));
			for(int j = 0; j < K; j++){
				if(s == D[j]){
					return true;
				}
			}
		}
		return false;
	}
}
