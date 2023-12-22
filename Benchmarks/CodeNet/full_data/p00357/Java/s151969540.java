import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] d = new int[n];
		boolean[] checked = new boolean[n];
		for(int i = 0; i < n; i++) {
			d[i] = sc.nextInt() / 10;
			checked[i] = false;
		}
		
		boolean ans = true;
		PriorityQueue<Integer> task = new PriorityQueue<Integer>(Collections.reverseOrder());
		task.add(0);
		boolean flag = false;
		while(!task.isEmpty()) {
			int x = task.poll();
			if(x == n - 1) {
				flag = true;
				task.clear();
				break;
			}
			if(!checked[x]) {
				for(int j = x + 1; j <= Math.min(x + d[x], n - 1); j++) {
					task.add(j);
				}
				checked[x] = true;
			}
		}
		ans &= flag;
		
		for(int i = 0; i < n; i++) {
			checked[i] = false;
		}
		flag = false;
		
		task = new PriorityQueue<Integer>();
		task.add(n - 1);
		while(!task.isEmpty()) {
			int x = task.poll();
			if(x == 0) {
				flag = true;
				break;
			}
			if(!checked[x]) {
				for(int j = x - 1; j >= Math.max(x - d[x], 0); j--) {
					task.add(j);
				}
				checked[x] = true;
			}
		}
		ans &= flag;
		
		String answer = ans? "yes" : "no";
		System.out.println(answer);
	}
}
