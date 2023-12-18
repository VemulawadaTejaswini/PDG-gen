import java.util.Arrays;
import java.util.Scanner;

public class Main {
	  private static int find(int dest, int[] a, int s, int e) {
		    if (s == e) {
		      return s;
		    }
		    int m = (s + e + 1) / 2;
		    return a[m] <= dest ? find(dest, a, s, m - 1) : find(dest, a, m, e);
		  }
	
	static boolean nextPermutation(int[] a){
	    for (int i = a.length - 1; i > 0; --i) {
	        if (a[i - 1] < a[i]) {
	          int swapIndex = find(a[i - 1], a, i, a.length - 1);
	          int temp = a[swapIndex];
	          a[swapIndex] = a[i - 1];
	          a[i - 1] = temp;
	          Arrays.sort(a, i, a.length);
	          return true;
	        }
	      }
	      return false;		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
		}
		for(int i = 0 ; i < N ; ++i){
			B[i] = sc.nextInt();
		}
		int C[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			C[i] = i + 1;
		}
		int a = 0;
		int b = 0;
		int cnt = 0;
		do{
//			System.out.println(Arrays.toString(C));
			if(Arrays.equals(A, C)){
				a = cnt;
			}
			if(Arrays.equals(B, C)){
				b = cnt;
			}
			++cnt;
		}while(nextPermutation(C));
		System.out.println(Math.abs(a - b));
	}
}
