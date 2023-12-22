import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static PrintWriter pw = ContestWriter.getInstance("out.txt", true);
	public static void main(String[] args) throws IOException {
		while(solve());
		pw.flush();
	}
	public static int n = 0;
	public static int i = 0;
	public static String[] token;
	public static int[] level;
	public static boolean solve() {
		n = sc.nextInt();
		if (n == 0) return false;
		i = 0;
		token = new String[n];
		level = new int[n];
		for(int i=0;i<n;i++) {
			token[i] = sc.next();
			for(int j=0;j<token[i].length();j++) {
				if (token[i].charAt(j) != '.') {
					break;
				}
				level[i] = j + 1;
			}
		}
		pw.println(exp(0));
		return true;
	}
	
	public static long exp(int lv) {
		char op = token[i].charAt(lv);
		if (op == '+') {
			i++;
			long sum = 0;
			while (i < n && level[i] == lv + 1) {
				sum += exp(lv + 1);
			}
			return sum;
		}else if(op == '*') {
			i++;
			long pi = 1;
			while (i < n && level[i] == lv + 1) {
				pi *= exp(lv + 1);
			}
			return pi;
		}else {
			long val = Integer.valueOf(token[i].substring(level[i]));
			i++;
			return val;
		}
	}

}
class ContestWriter extends PrintWriter {
	private ContestWriter(String fileName) throws IOException {
		super(new OutputStreamWriter(new FileOutputStream(new File(fileName)), "UTF-8"), false);
	}
	public static PrintWriter getInstance(String fileName, boolean debug) {
		if (debug) return new PrintWriter(System.out);
		try {
			return new ContestWriter(fileName);
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}
	public void println() {
		write('\n');
	}
}
