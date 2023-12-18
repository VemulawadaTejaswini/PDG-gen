import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] B = new int[N-1];
		for(int i = 0;i < N-1;i++){
			B[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int Asum = B[0];
		if(N >= 3){
			for(int i = 1;i < N-1;i++){
				Asum += Math.min(B[i-1], B[i]);
			}
		}
		Asum += B[N-2];
		System.out.println(Asum);
	}
}