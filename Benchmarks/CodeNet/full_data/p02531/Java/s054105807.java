import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		char[] ary = new char[1000];
		int tail = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while (!"quit".equals(line = br.readLine())) {
			if ('o' == line.charAt(1)) tail = pop(ary, tail);		
			else tail = push(ary, tail, line.split(" ")[1].charAt(0));
		}
	}
	
	public static int pop(char[] ary, int tail) {
		System.out.println(ary[--tail]);
		return tail;
	}
	
	public static int push(char[] ary, int tail, char c) {
		ary[tail++] = c;
		return tail;
	}
}