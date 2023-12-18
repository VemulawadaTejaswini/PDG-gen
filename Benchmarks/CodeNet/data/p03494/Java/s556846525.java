import java.util.*;
public class Main{
	static int ShiftOnly(int[] a, int k){
		int[] numa = new int[k];
		for(int i=0; i<k; i++){
			while(a[i]%2==0){
				numa[i]++;
				a[i] /= 2;
			}
		}
		Arrays.sort(numa);
		return numa[0];
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		System.out.println(ShiftOnly(A, N));
	}
}