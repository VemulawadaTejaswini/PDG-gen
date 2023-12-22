import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int total = 0;
		int count = 0;
	
		
		Deque<Integer> a = new ArrayDeque<>();
		Deque<Integer> b = new ArrayDeque<>();
		
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}

		for(int i=0;i<m;i++) {
			b.add(sc.nextInt());
		}
		while(true) {
			if(a.peek() == null) {
				total += b.poll();
				count++;
			}else if(b.peek() == null){
				total += a.poll();
				count++;
			}else {
			
			if(a.peek()<=b.peek()) {
				if(k <= total + a.peek()) {
					break;
				}
				total += a.poll();
				count++;
				
			}else if(a.peek()>b.peek()){
				if(k <= total + b.peek()) {
					break;
				}
				total += b.poll();
				count++;
			}
			}
			
			if(count == n + m) {
				break;
			}
			
		}
		
		System.out.println(count);
		
	}
}