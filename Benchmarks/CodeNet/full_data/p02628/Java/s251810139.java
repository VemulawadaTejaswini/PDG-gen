import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] P = new int[N];
		for(int i=0;i<N;i++) {
			P[i]=scan.nextInt();
		}
		scan.close();
		Arrays.parallelSort(P);
		int result = 0;
		for(int i=0;i<K;i++) {
			result += P[i];
		}
		System.out.println(result);
	}

}