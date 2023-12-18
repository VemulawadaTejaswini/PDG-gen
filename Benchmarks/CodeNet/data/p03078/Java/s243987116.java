package atCoder;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int X=sc.nextInt();
		int Y=sc.nextInt();
		int Z=sc.nextInt();
		int K=sc.nextInt();

		long[] A=new long[X];
		long[] B=new long[Y];
		long[] C=new long[Z];

		int type=X*Y*Z;

		long[] table=new long[type];

		for(int i=0;i<X;i++) {
			A[i]=sc.nextLong();
		}

		for(int i=0;i<Y;i++) {
			B[i]=sc.nextLong();
		}

		for(int i=0;i<Z;i++) {
			C[i]=sc.nextLong();
		}

		int index=0;

		for(int i=0;i<X;i++) {
			for(int j=0;j<Y;j++) {
				for(int k=0;k<Z;k++) {
					table[index]=A[i]+B[j]+C[k];
					index++;
				}
			}
		}

		Arrays.sort(table);

		for(int i=type-1;i>=type-K;i--) {
			System.out.println(table[i]);
		}


		sc.close();

	}

}
