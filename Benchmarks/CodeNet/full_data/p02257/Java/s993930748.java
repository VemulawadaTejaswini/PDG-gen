import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int n;
	static int[] nums;
	static int result;
	
	static void input() throws IOException {
		n = readInt();
		nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = readInt();
		}
	}
	
	static void process() {
		for (int i : nums) {
			if (isPrime(i)) {
				result++;
			}
		}
	}
	
	static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		} else if (n % 2 == 0) {
			return false;
		}
		
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	static void output() {
		System.out.println(result);
	}
	
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