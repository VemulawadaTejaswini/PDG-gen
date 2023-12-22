import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++)
			h[i] = scan.nextInt();
		
		AdjancencyList[] list = new AdjancencyList[n];
		for(int i = 0; i < n; i++)
			list[i] = new AdjancencyList();
		
		for(int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			list[a-1].push(b-1);
			list[b-1].push(a-1);
		}
		scan.close();
		
		int ans = 0;
		for(int i = 0; i < n; i++) {
			ans++;
			while(!list[i].isEmpty()) {
				int c = list[i].poll();
				if(h[i] <= h[c]) {
					ans--;
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
}

class AdjancencyList{
	LinkedList<Integer> list = new LinkedList<>();
	
	public AdjancencyList() {
	}
	
	public void push(int a) {
		list.add(a);
	}
	
	public int poll() {
		return list.poll();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
