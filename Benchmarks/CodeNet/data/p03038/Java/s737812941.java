import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(A);
		
		int[][] BC = new int[M][2];
		for(int i=0;i<M;i++){
			BC[i][0] = Integer.parseInt(sc.next());
			BC[i][1] = Integer.parseInt(sc.next());
			
		}
		Arrays.sort(BC,(a,b) -> Integer.compare(b[1], a[1]));
		
		int fetch=0;
		
		for(int i=0;i<M;i++){
			if(fetch>=N)continue;
			int B = BC[i][0];
			int C = BC[i][1];
			for(int j=0;j<B;j++){
				int p = A[fetch];
				
				if(p>=C){
					continue;
				}else{
					A[fetch] = C;
					fetch++;
				}
				
			}
			
		}
		
		long ans = 0L;
		
		for(int q : A){
			ans += q;
		}
		
		System.out.println(ans);
			
		
		
		
		
	}
	
	
	
}