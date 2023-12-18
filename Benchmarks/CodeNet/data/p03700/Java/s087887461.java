import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * https://abc063.contest.atcoder.jp/tasks/arc075_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		PriorityQueue<Integer> que = new PriorityQueue<>((o1,o2)->o2-o1);
		for(int i=0; i<N; i++){
			que.add(Integer.parseInt(sc.next()));
		}
		sc.close();
		
		long ans = 0;
		while(!que.isEmpty()){
			int h = que.remove();
			if(h>ans*B){
				ans++;
				que.add(h-(A-B));
			}
		}
		
		System.out.println(ans);

	}

}
