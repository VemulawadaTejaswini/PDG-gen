import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] A = new int[N][3];

		for(int i = 0 ; i < N ; i++){
			A[i][0] = Integer.parseInt(sc.next());
			A[i][1] = Integer.parseInt(sc.next());
			A[i][2] = Integer.parseInt(sc.next());
		}

		sc.close();

		int[] S = new int[N];

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
