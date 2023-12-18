import java.util.PriorityQueue;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); int K = sc.nextInt();
		PriorityQueue<String> que = new PriorityQueue<String>();
		for(int i = 0; i < s.length(); i++) {
			for(int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				if(que.contains(sub)) continue;
				que.add(sub);
				if(que.size() >= 1000) {
					PriorityQueue<String> newque = new PriorityQueue<String>();
					for(int k = 0; k < 10; k++) newque.add(que.poll());
					que = newque;
				}
			}
		}
		while(K > 1) {
			que.poll();
			K--;
		}
		System.out.println(que.poll());
	}
}