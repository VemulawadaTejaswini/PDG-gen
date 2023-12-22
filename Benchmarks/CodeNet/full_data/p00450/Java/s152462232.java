import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] c = new int[n];
			for(int i = 0; i < n; i++) {
				c[i] = sc.nextInt();
			}
			ArrayDeque<Data> stack = new ArrayDeque<Data>();
			stack.push(new Data(c[0],1));
			for(int i = 1; i < n; i++) {
				if((i+1) % 2 == 0) {
					if(stack.peek().color == c[i]) {
						Data tmp = stack.pop();
						tmp.count++;
						stack.push(tmp);
					}
					else {
						Data tmp = stack.pop();
						tmp.color = c[i];
						tmp.count++;
						stack.push(tmp);
					}
				}
				else {
					if(stack.peek().color == c[i]) {
						Data tmp = stack.pop();
						tmp.count++;
						stack.push(tmp);
					}
					else {
						stack.push(new Data(c[i],1));
					}
				}
			}
			int sum = 0;
			while(!stack.isEmpty()) {
				if(stack.peek().color == 0) sum += stack.pop().count;
				else stack.pop();
			}
			System.out.println(sum);
			
		}
		
	}
	static class Data {
		int color;
		int count;
		Data(int a, int b) {
			color = a;
			count = b;
		}
	}

	
}