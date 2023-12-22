import java.util.*;

public class Main {
	static int cnt=0;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		shellSort(a,N);
		System.out.println(cnt);
		for(int i=0;i<N;i++){
				System.out.println(a[i]);
		}	
	}
	
	static void insertionSort(int[] A,int n,int g){
		for(int i=g;i<n;i++){
			int v=A[i];
			int j=i-g;
			while(j>=0&&A[j]>v){
				A[j+g]=A[j];
				j=j-g;
				cnt++;
			}
			A[j+g]=v;
		}
	}
	
	static void shellSort(int[] A,int n){
		cnt=0;
		int h=1;
		int m=0;
		while(true){
			if(h>A.length){
				break;
			}
			h=3*h+1;
			m++;
		}
		System.out.println(m);
		int[] G=new int[m];
		G[m-1]=1;
		for(int i=m-2;i>=0;i--){
			G[i]=3*G[i+1]+1;
		}
		for(int i=0;i<m;i++){
			if(i==m-1){
				System.out.println(G[i]);
			}else{
				System.out.print(G[i]+" ");
			}
		}
		for(int i=0;i<m;i++){
			insertionSort(A,n,G[i]);
		}	
	}
}