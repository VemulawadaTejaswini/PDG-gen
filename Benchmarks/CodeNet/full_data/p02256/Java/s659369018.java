import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int x, y;
	
	static void input() throws IOException {
		int[] num = readMultiInt();
		x = num[0];
		y = num[1];
	}
	
	static void process() {
	}
	
	static int gcd(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		} else {
			return gcd(num2, num1 % num2);
		}
	}
	
	static void output() {
		System.out.println(gcd(x, y));
	}
	
	//??\?????±?????¨???
	static BufferedReader in;
	
	static void initBufferedReader() {
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	static String readString() throws IOException {
		return in.readLine();
	}
	
	static int readInt() throws NumberFormatException, IOException {
		return Integer.valueOf(readString());
	}
	
	static int[] readMultiInt() throws IOException {
		String input = readString();
		String[] values = input.split(" ");
		int[] result = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			result[i] = Integer.valueOf(values[i]);
		}
		return result;
	}
	
	static String arrayToString(int[] data) {
		String result = "";
		for (int i = 0; i < data.length; i++) {
			if (i >= data.length - 1) {
				result += String.valueOf(data[i]);
			} else {
				result += String.valueOf(data[i]) + " ";
			}
		}
		return result;
	}
	
	static long factional(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		initBufferedReader();
		input();
		process();
		output();
	}
	
}