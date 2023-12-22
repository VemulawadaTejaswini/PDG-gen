import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//一行目をインプット
		int n = scan.nextInt();
		int[] S = new int[n];
		for (int i=0; i<n; i++) {
			S[i] = scan.nextInt();
		}

		//二行目をインプット
		int q = scan.nextInt();
		int[] T = new int[q];
		for (int i=0; i<q; i++) {
			T[i] = scan.nextInt();
		}

		Arrays.sort(S);
		Arrays.sort(T);
		int count =0;

		if(n < q){

			for(int i = 0; i < n;i++){
				for(int j = 0;j < q;j++){
					if(S[i] == T[j]){
						count++;
						break;
					}
				}
			}
		}

		if(q < n){
			for(int i = 0; i < q;i++){
				for(int j = 0;j < n;j++){
					if(S[j] == T[i]){
						count++;
						break;
					}
				}
			}
		}

		System.out.println(count);
	}
}

