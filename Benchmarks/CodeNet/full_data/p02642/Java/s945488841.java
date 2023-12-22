import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		boolean[] bool = new boolean[N];
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		for(int i=0; i<N; i++) {
			que.add(sc.nextInt());
		}
		for(int i=0; i<N; i++) {
			A[i] = que.poll();
			bool[i] = true;
		}

		for(int i=0; i<N; i++) {
			if(bool[i]) {
				for(int j=i+1; j<N; j++) {
					if(A[j]%A[i]==0) {
						bool[j] = false;
					}
					if(A[j]==A[i]) {
						bool[i] = false;
					}
				}
			}
		}

		int ans=0;
		for(int i=0; i<N; i++) {
			if(bool[i]) {
				ans ++;
			}
		}

		System.out.println(ans);



	}
}
