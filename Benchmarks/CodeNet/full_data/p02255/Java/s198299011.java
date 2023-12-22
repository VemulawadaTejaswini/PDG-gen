import java.util.*;

public class Main{

	static void print(int n, int[] a){
		
		System.out.print(a[0]);
		for(int i = 1; i < n; i++) System.out.print(" "+a[i]);
		System.out.println();
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		
		int v, j;
		
		print(N, A);
		
		for(int i = 1; i < N; i++){
			v = A[i];
			j = i - 1;
			while(j >= 0 && A[j] > v){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			print(N, A);
		}
	}
}
