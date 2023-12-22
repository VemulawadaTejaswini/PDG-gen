import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		}
		int cnt=0;
		for(int i=0; i<n; i++){
			for(int j=n-1; j>i; j--){
				if(A[j]<A[j-1]){
					int wk=A[j];
					A[j]=A[j-1];
					A[j-1]=wk;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}