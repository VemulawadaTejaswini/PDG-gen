import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int N;
	static int[] A;
	
	static void input() throws IOException {
		N = readInt();
		A = readMultiInt();
	}
	
	static void process() {
		for (int i = 0; i < N; i++) {
			int n = A[i];
			int j = i - 1;
			while( j >= 0 && A[j] > n) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = n;
			output0();
		}
	}
	
	static void output0() {
		for (int i = 0; i < N - 1; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println(A[N - 1]);
	}
	
	static void output() {
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