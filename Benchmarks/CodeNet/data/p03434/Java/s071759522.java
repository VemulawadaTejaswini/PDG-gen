import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int ansA=0;
		int ansB =0;
		for(int i=0;i<N;i++){
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		for(int i = 0;i<N;i=i+2){
			ansA=ansA+A[i];
		}
		for(int i =1;i<N;i=i+2){
			ansB =ansB +A[i];
		}
		System.out.println(Math.abs(ansA-ansB));
		sc.close();
	}
}
