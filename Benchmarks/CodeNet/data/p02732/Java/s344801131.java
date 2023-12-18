import java.util.Scanner;

public class Main {
	
	static void sort(int[] a) {
		for(int j = 0;j<a.length-1;j++) {
			for(int i = a.length-1;i>j;i--) {
				if(a[i-1]>a[i]) {
					int temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
				}
			}
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		
		int A[] = new int[N];
		
		for(int i = 0;i<N;i++) A[i] = cin.nextInt();
		
		
		
		
		for(int k = 0;k<N;k++) {
			int sum = 0;
			int count = 0;
			int B[] = A.clone();
			B[k] = 0;
			sort(B);
			for(int i = 1;i<N-1;i++) {
				if(B[i] == B[i+1]) count++;
				else if(B[i] != B[i+1]) {
					sum += (count+1)*count/2;
					count = 0;
				}
			}
			sum+=(count+1)*count/2;
			System.out.println(sum);
		}
		
	}

}
