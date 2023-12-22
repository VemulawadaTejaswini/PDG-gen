import java.util.*;
public class Main{
	static int[] A =new int[100000];
	static int n;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0;i<n;i++){
			A[i]=sc.nextInt();
		}
		/*
		for(int i=0;i<n;i++){
			System.out.print(A[i] +" ");
		}
		*/
		
		int q = partition(0, n-1);
		for(int i = 0;i<n;i++){
			if(i != q){
				System.out.print(A[i]);
			}else{
				System.out.print("[" + A[i] + "]");
			}
			
			if(i < n - 1){
				System.out.print(" ");
			}
		}
		
		System.out.println();
		return;
	}
	
	public static int partition(int p, int r){
		int x, i, j, t;
		x= A[r];
		i = p - 1;
		for(j = p; j < r;j++){
			if(A[j] <= x){
				i++;
				t = A[i];
				A[i] = A[j];
				A[j] = t;
			}
		}
		t = A[i + 1];
		A[i + 1] = A[r];
		A[r] = t;
		return i + 1;
	}
}