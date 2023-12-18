import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int[] A, B;
	int[] nums;
	int result;

	Main(int N, int[] A, int[] B) {
		this.nums = new int[4];
		Arrays.fill(this.nums, 0);
		this.nums[0] = N;
		this.A = A;
		this.B = B;
		this.result = N;
		calc();
	}

	void calc() {
		
		int current = this.nums[0];
		for (int i = 0; i < 3; ++i) {
			this.result = Math.max(this.result, exchange(current, A[i], B[i]));
		}
		current = this.result;
		for (int i = 0; i < 3; ++i) {
			this.result = Math.max(this.result, exchange(current, B[i], A[i]));
		}
		System.out.println(this.result);
	}

	int exchange(int n, int a, int b) {
		if(n < a) {
			return n;
		}
		int result = 0;
		result += (n / a) * b + (n % a);
		return result;
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		int[] A = new int[3];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < 3; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		int[] B = new int[3];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < 3; ++i) {
			B[i] = Integer.parseInt(tokens[i]);
		}
		

		in.close();
		Main ins = new Main(N, A, B);

	}

}