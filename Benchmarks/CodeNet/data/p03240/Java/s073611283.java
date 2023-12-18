import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[][] A = new long[N][3];

		for(int i = 0 ; i < N ; i++){
			A[i][0] = Long.parseLong(sc.next());
			A[i][1] = Long.parseLong(sc.next());
			A[i][2] = Long.parseLong(sc.next());
		}

		sc.close();

		long[] S = new long[N];

		int count = 0;
		for(int i = 0 ; i <= 100 ; i++){
			for(int j = 0 ; j <= 100 ; j++){
				for(int k = 0 ; k < N ; k++){
					S[k] = Math.abs(i-A[k][0]) + Math.abs(j-A[k][1]);
					if(k > 0){
						if(S[k]+ A[k][2] == S[k-1] + A[k-1][2]){
							count++;
						}
						else{
							count = 0;
							break;
						}
						if(count == N-1){
							System.out.println(i +" "  + j + " "  + (S[k]+ A[k][2]));
						}
					}
				}
			}
		}
	}
}