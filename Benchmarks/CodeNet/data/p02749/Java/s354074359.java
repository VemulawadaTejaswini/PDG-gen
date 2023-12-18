
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
		for (int i=1;i<=n;i++) {
			graph.put(i,new ArrayList<Integer>());
		}
		for (int i=0;i<n-1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		
		ArrayDeque<Integer> pointDeq = new ArrayDeque<Integer>();
		ArrayDeque<Integer> distDeq = new ArrayDeque<Integer>();
		boolean[] visited = new boolean[n+1];
		int[] dist = new int[n+1];
		pointDeq.push(1);
		distDeq.push(0);
		while (!pointDeq.isEmpty()) {
			int next = pointDeq.pop();
			int nextDist = distDeq.pop();
			dist[next] = nextDist;
			visited[next]=true;
			for (Integer intg : graph.get(next)) {
				if(!visited[intg]) {
					pointDeq.push(intg);
					distDeq.push(nextDist+1);
				}
			}
		}
		
		int oddCount = 0;
		int evenCount = 0;
		for (int i=1;i<=n;i++) {
			if (dist[i]%2==1) {
				oddCount++;
			} else {
				evenCount++;
			}
		}
		
		ArrayDeque<Integer> zero = new ArrayDeque<>();
		ArrayDeque<Integer> one = new ArrayDeque<>();
		ArrayDeque<Integer> two = new ArrayDeque<>();
		
		for (int i=1;i<=n;i++) {
			if (i%3==0) {
				zero.offer(i);
			} else if (i%3==1) {
				one.offer(i);
			} else {
				two.offer(i);
			}
		}
		
		if (oddCount>evenCount*2) {
			for (int i=1;i<=n;i++) {
				if (dist[i]%2==0) {
					System.out.println(zero.poll());
				} else if (!one.isEmpty()) {
					System.out.println(one.poll());
				} else if (!two.isEmpty()){
					System.out.println(two.poll());
				} else {
					System.out.println(zero.poll());
				}
			}
			
		} else if (evenCount>oddCount*2) {
			for (int i=1;i<=n;i++) {
				if (dist[i]%2==1) {
					System.out.println(zero.poll());
				} else if (!one.isEmpty()) {
					System.out.println(one.poll());
				} else if (!two.isEmpty()) {
					System.out.println(two.poll());
				} else {
					System.out.println(zero.poll());
				}
			}
		} else {
			for (int i=1;i<=n;i++) {
				if (dist[i]%2==0) {
					if (!one.isEmpty()) {
						System.out.println(one.poll());
					} else {
						System.out.println(zero.poll());
					}
				} else {
					if (!two.isEmpty()) {
						System.out.println(two.poll());
					} else {
						System.out.println(zero.poll());
					}
				}
			}
		}
	}


}

