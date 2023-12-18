import java.util.Scanner;

public class Main {

	public static boolean check(int[] xor, int[] sum, int l, int r) {
		int tmpXor = xor[r] ^ (l==0?0:xor[l-1]);
		int tmpSum = sum[r] - (l==0?0:sum[l-1]);
//		System.out.println(tmpXor+", "+tmpSum);
		return tmpXor == tmpSum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] arr = sc.nextLine().split(" ");
		int[] a = new int[arr.length];
		for(int i=0 ;i<a.length; i++)
			a[i] = Integer.parseInt(arr[i]);
		sc.close();

		int[] xor = new int[a.length];
		int[] sum = new int[a.length];
		xor[0] = a[0];
		sum[0] = a[0];
		for(int i=1; i<arr.length; i++) {
			xor[i] = xor[i-1] ^ a[i];
			sum[i] = sum[i-1] + a[i];
		}

//		for(int i=0; i<xor.length; i++)
//			System.out.print(xor[i]+", ");
//		System.out.println();
//		for(int i=0; i<sum.length; i++)
//			System.out.print(sum[i]+", ");
//		System.out.println();

		int count = 0;
		for(int l=0; l<n; l++) {
			for(int r=l; r<n; r++) {
//				System.out.print("\t"+l+", "+r+": ");
				if(check(xor, sum, l, r))
					count++;
			}
		}
		System.out.println(count);
	}
}
