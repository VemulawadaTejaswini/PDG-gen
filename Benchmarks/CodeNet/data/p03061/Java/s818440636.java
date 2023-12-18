import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max  = 0;
		int [] A = new int[N];
		for(int i=0;i<N;i++) {
		A[i]=sc.nextInt();
			if(i!=0) {
				int temp;
				while((temp = A[0]%A[i])!=0) {
					A[0] = A[i];
					A[i] = temp;
				}
				max = Math.max(A[i-1], max);
			}
		}
		sc.close();
		System.out.print(max);
	}
}