import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n%2==0?n/2:n/2+1;
		int A[] = new int[m];
		int B[] = new int[m];
		int k=0, high, low, work;
		for(int i=0; i<m; i++){
			high = sc.nextInt();
			if(m>i+1 || n%2==0) low = sc.nextInt();
			else                low = 0;
			A[i] = high<<16 | low;
			if(high > low) work = high;
			else           work = low;
			if(k < work) k = work;
		}
		sc.close();
		countingSort(A, B, k, n, m);
		StringBuilder sb = new StringBuilder();
		sb.append(B[0]>>16);
		if(m>1 || n%2==0){
			sb.append(" ");
			sb.append(B[0]&0x0000ffff);
		}
		for(int i=1; i<m; i++){
			sb.append(" ");
			sb.append(B[i]>>16);
			if(m>i+1 || n%2==0){
				sb.append(" ");
				sb.append(B[i]&0x0000ffff);
			}
		}
		System.out.println(sb.toString());
	}
	static void countingSort(int A[], int B[], int k, int n, int m){
		int C[] = new int[k+1];
		for(int i=0; i<m; i++){
			C[A[i]>>16]++;
			if(m>i+1 || n%2==0) C[A[i]&0x0000ffff]++;
		}
		for(int i=1; i<k+1; i++){
			C[i] += C[i-1];
		}
		for(int i=m-1; i>=0; i--){
			if(m-1!=i || n%2==0){
				if((C[A[i]&0x0000ffff]-1)%2 == 0)
					B[(C[A[i]&0x0000ffff]-1)/2] |= (A[i]&0x0000ffff)<<16;
				else
					B[(C[A[i]&0x0000ffff]-1)/2] |= (A[i]&0x0000ffff);
				C[A[i]&0x0000ffff]--;
			}
			if((C[A[i]>>16]-1)%2 == 0)
				B[(C[A[i]>>16]-1)/2] |= (A[i]>>16)<<16;
			else
				B[(C[A[i]>>16]-1)/2] |= (A[i]>>16);
			C[A[i]>>16]--;
		}
	}
}