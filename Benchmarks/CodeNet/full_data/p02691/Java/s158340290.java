import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int s=0;
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(Math.abs((i-1)-(j-1))==(A[i])+(A[j])){
					s++;
				}
			}
		}
		System.out.println(s/2);
	}

}