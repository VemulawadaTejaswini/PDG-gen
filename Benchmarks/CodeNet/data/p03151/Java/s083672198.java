
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];

		for(int i =0 ; i< n ;i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n ; i++){
			b[i] = sc.nextInt();
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		long loss = 0;
		int ans = 0;
		
		for(int i = 0; i < n ; i++ ){
			if(a[i] < b[i]){
				ans++;
				loss += b[i]-a[i];
			}else{
				pq.add(b[i]-a[i]);
			}
		}
		if(ans == 0){
			System.out.println(0);
			return;
			
		}
		
		for(;!pq.isEmpty();){
			ans++;
			loss += pq.poll();
			if(loss <= 0){
				System.out.println(ans);
				return;
			}
		}
		System.out.println(-1);
		
	}
}
