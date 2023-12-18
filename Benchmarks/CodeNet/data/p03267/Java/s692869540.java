import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		in.close();
		StringBuilder sb = new StringBuilder();
		String ls = System.lineSeparator();
		Stack<Integer> stack = new Stack<>();
		int node = 0;
		int edge = 0;
		while(l>0) {
			stack.add(l&1);
			l = l>>1;
		}
		node = stack.size();
		int num = node;
		int sum = 0;
		stack.pop();
		sum += pow2(num-1);
		while(!stack.isEmpty()) {
			num--;
			sb.append(num + " " + (num+1) + " " + 0 + ls);
			sb.append(num + " " + (num+1) + " " + pow2(num-1) + ls);
			edge += 2;
			if(stack.pop()==1) {
				sb.append(num + " " + node + " " + sum + ls);
				sum += pow2(num-1);
				edge += 1;
			}
		}
		System.out.println(node + " " + edge);
		System.out.println(sb.toString());
	}
	
	public static int pow2(int exp) {
		int ans = 1;
		for(int i=0;i<exp;i++) {
			ans *= 2;
		}
		return ans;
	}

}
