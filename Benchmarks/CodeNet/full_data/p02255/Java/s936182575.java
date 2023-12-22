import java.util.Scanner;
class A {

	public static void main(String[] args) {
		int i, N, v, j, b, A[] = new int[1000];
		Scanner sc = new Scanner(System.in);
		while(true) {
			N = sc.nextInt();
			if(N<101 && N>0) {
				break;
			}
			System.out.println("Error\n");
		}
		
		for(i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for(i=0; i<N; i++) {
			for(b=0; b<N-1; b++) {
				System.out.print(A[b] + " ");
			}
			System.out.println(A[N-1]);
			v=A[i];
			j=i-1;
			while(j>=0 && A[j]>v) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
		}
		
		for(i=0; i<N-1; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println(A[N-1]);

	}

}


