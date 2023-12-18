import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] array = new long[2][200001];
		int[] A = new int[n];
		for(int i=0;i<n;i++) 	A[i]=sc.nextInt();
		for(int i=0;i<n;i++) 	array[0][A[i]]++;
		for(int i=0;i<=200000;i++) {
			if(array[0][i]!=0) array[1][i]=comb(array[0][i]);
		}
		long sum=0;
		for(int i=0;i<=200000;i++) sum+=array[1][i];
		long S=sum;
		for(int i=0;i<n;i++) {
			if(array[0][A[i]]>=1) {
				S-=(array[0][A[i]]-1);
			}
			System.out.println(S);
			S=sum;
		}
	}

	public static long comb(long n) {
		return n*(n-1)/2;
	}
}