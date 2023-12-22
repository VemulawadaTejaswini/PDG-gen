import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer>[] edge = new ArrayList[N];
		for(int i = 0; i < N; i++)
		    edge[i] = new ArrayList<>();
		for (int i = 0; i < M; i++) {
		    int a = sc.nextInt()-1;
		    int b = sc.nextInt()-1;
		    edge[a].add(b);
		    edge[b].add(a);
		}
		int[] ans = new int[N];
		Queue<Integer> s = new ArrayDeque<>();
		s.offer(0);
		while(s.size() > 0) {
			int x = s.poll();
			for(int i : edge[x]) {
				if(ans[i] == 0) {
					ans[i] = x+1;
					s.add(i);					
				}
			}
		}
		System.out.println("Yes");
		for(int i = 1; i < N; i++)
			System.out.println(ans[i]);
	}

}