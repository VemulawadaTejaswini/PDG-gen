import java.util.*;

public class Main{
	static int insertionSort(int[] A, int n, int g){
		int i, j, v, cnt = 0;
		
		for(i = g; i < n; i++){
			v = A[i];
			j = i -g;
			
			while(j >= 0 && A[j] > v){
				A[j + g] = A[j];
				j = j - g;
				cnt ++;
			}
			
			A[j + g] = v;
		}
		
		return cnt;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, i, g, cnt = 0, m = 0;
		int[] A = new int[1000000], G = new int[100];
		
		n = sc.nextInt();
		for(i = 0; i < n; i++){
			A[i] = sc.nextInt();
		}
		
		while(true){
			if(m == 0){
				g = 1;
			}
			else{
				g = 3 * G[m - 1] + 1;
			}
			
			if(g > n){
				break;
			}
			
			G[m] = g;
			m ++;
		}
		
		for(i = 0; i < m; i++){
			cnt += insertionSort(A, n, G[m - 1 - i]);
		}
		
		System.out.println(m);
		for(i = 0; i < m - 1; i++){
			System.out.print(G[m - 1 - i] + " ");
		}
		System.out.println(G[m - 1 - i]);
		System.out.println(cnt);
		for(i = 0; i < n; i++){
			System.out.println(A[i]);
		}
	}
}