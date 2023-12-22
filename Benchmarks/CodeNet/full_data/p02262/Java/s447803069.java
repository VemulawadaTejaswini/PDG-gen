import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] A = new int[n]; 
		for(int i=0;i<n;i++){
			A[i] = Integer.parseInt(sc.next()); 
		}
		
		int cnt = shellSort(A,n);
		System.out.println(cnt);
		
		for(int i=0;i<n;i++){
			System.out.println(A[i]);
		}

	}
	
	public static int insertionSort(int[] A, int n, int g){
		int cnt=0;
		for(int i=g;i<n;i++){
			int v = A[i];
			int j = i - g;
			while(j>=0 && A[j]>v){
				A[j+g]=A[j];
				j=j-g;
				cnt++;
			}
			A[j+g]=v;
		}
		return cnt;
	}
	
	public static int shellSort(int[] A, int n){
		int cnt = 0;
		int m = 0;
		int p=n;
		while(p>1){
			p/=2;
			m++;
		}
		int[] G=new int[m];
		System.out.println(m);
		p=n/2;
		for(int i=0;i<m;i++){
			G[i]=p;
			p/=2;
			System.out.print(G[i]);
			if(i != m-1){
				System.out.print(" ");
			}else{
				System.out.println();
			}
		}
		for(int i=0;i<m;i++){
			cnt += insertionSort(A,n,G[i]);
		}
		return cnt;
	}

}