import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		Deque<Integer> A = new ArrayDeque<>();
		Deque<Integer> B = new ArrayDeque<>();

		for(int i = 0; i < n; i++) {
			A.add(Integer.parseInt(sc.next()));
		}

		for(int i = 0; i < m; i++) {
			B.add(Integer.parseInt(sc.next()));
		}
		
		int ans =0;
		while(k > 0) {
			if(A.size()==0 && B.size()==0) {
				break;
			}else if(A.size()==0) {
				k -= B.poll();
			}else if(B.size()==0) {
				k -= A.poll();
			}else {
				
				if(A.peek() >= B.peek()) {
					k -= B.poll();
				}else {
					k -= A.poll();
				}
				
				
			}
			if(k >= 0) {
				ans++;
			}
			
		}
		System.out.println(ans);

	}
}


