import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int v[] = new int[n];
		
		for(int i =0; i < n ;i++) {
			v[i] = sc.nextInt();
		}
		
		long left[] = new long[k+1];


		for(int i =0;i <= k ; i++) {
			for(int j = 0;j <= i;j++) {
				int score = 0;
				
				int l = 0;
				PriorityQueue<Integer> q =new PriorityQueue<Integer>();
				for(l = 0 ; l < Math.min(j,n); l++) {
					score += v[l];
					q.add(v[l]);
				}
				
				for(;l < i && !q.isEmpty(); l++) {
					score -= q.remove();
				}
				
				left[i] = Math.max(left[i], score);
			}
		}

		
		long right[] = new long[k+1];
		for(int i =0;i <= k ;i++) {
			
			for(int j = 0;j <= i;j++) {
				int score = 0;
				
				int l = 0;
				PriorityQueue<Integer> q =new PriorityQueue<Integer>();
				for(l = 0 ; l < Math.min(j,n); l++) {
					int ll = n - 1 - l;
//					System.out.println(i+" "+ ll);
					score += v[ll];
					q.add(v[ll]);
				}
				
				for(;l < i && !q.isEmpty(); l++) {
					score -= q.remove();
				}
				
				right[i] = Math.max(right[i], score);
//				System.out.println(i+" ,,, " + right[i]);
			}
			
		}

		
		long res = 0;
		for(int i = 0 ; i <= k;i++) {
			for(int j = 0; i+j <= k; j++) {
//				System.out.println(i + " : "+ left[i] + "  -  "+j + " : "+ right[j]);
				res = Math.max(left[i]+right[j] , res);
			}
		}
		System.out.println(res);
	
	}
}
