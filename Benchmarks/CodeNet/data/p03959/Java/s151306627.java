import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N];
		int[] A = new int[N];
		for(int i = 0; i<N ; i++){
			T[i] = sc.nextInt();
		}
		for(int i = 0; i<N ; i++){
			A[i] = sc.nextInt();
		}
		int max1 = 0;
		int max2 = 0;
		int x = 0;
		int x1 = 0;
		int y = 0;
		int y1 = 0;
		for(int i = 0; i < N; i++){
			if(max1<T[i]){
				max1 = T[i];
			}
			if(max2<A[i]){
				max2 = A[i];
			}
		}
		if(max1 != max2){
			System.out.println(0);
		}else{
			for(int i = 1; i < N; i++){
				if(T[i-1] == T[i]){
					x = i;
					x1 = T[i];
					break;
				}
			}
			for(int i = N-1; i >0; i--){
				if(A[i] == A[i-1]){
					y = i-1;
					y1 = A[i-1];
					break;
				}
			}
			double Z = Math.min(x1, y1);
			x = y-x+1;
			double num = Math.pow(Z, x);
			System.out.println((int)(num % 1000000007));
		}
	}
}