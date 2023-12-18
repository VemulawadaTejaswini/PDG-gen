import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		Arrays.sort(A);


		int[] gc = new int[N-1];
		gc[0]=gcd(A[0],A[1]);
		for (int i=0;i<N-2;i++) {
			gc[i+1]= gcd(gc[i],A[i+2]);
		}
		System.out.println(gc[N-2]);
	}

	static int gcd(int a,int b) {
	int temp;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return b;
	}
}