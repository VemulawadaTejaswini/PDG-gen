import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = r.readLine().split(" ");
		int[] stack = new int[s.length];
		int topOfStack = 0;
		
		for (int i = 0; i < s.length; i++) {
			switch (s[i].charAt(0)) {
				case '+':
					topOfStack--;
					stack[topOfStack-1] = stack[topOfStack - 1] + stack[topOfStack];
					break;
				case '-':
					topOfStack--;
					stack[topOfStack-1] = stack[topOfStack - 1] - stack[topOfStack];
					break;
				case '*':
					topOfStack--;
					stack[topOfStack-1] = stack[topOfStack - 1] * stack[topOfStack];
					break;
				default:
					stack[topOfStack] = Integer.parseInt(s[i]);
					topOfStack++;
					break;
			}
		}
		
		System.out.println(stack[0]);
	}
	
}
