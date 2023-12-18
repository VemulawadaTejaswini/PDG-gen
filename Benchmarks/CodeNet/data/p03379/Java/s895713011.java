import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int bn_search(int[] X, int a) {
		int high = X.length, low = 0;
		while(high - low > 1) {
			int mid = (high + low) / 2;
			if(X[mid] == a) return mid;
			if(X[mid] > a) high = mid;
			else low = mid;
		}
		if(X[low] == a) return low;
		return -1;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] sorted_X = new int[N];
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			sorted_X[i] = X[i];
		}
		Arrays.sort(sorted_X);

		for(int i = 0; i < N; i++){
			int index = bn_search(sorted_X, X[i]);
			if(N/2 > index) System.out.println(sorted_X[N / 2]);
			else System.out.println(sorted_X[N / 2 - 1]);
		}
	}
}