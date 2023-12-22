import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	boolean check(int[] array, int start, int sum, int key) {
		int tmpsum;
		for (int i = start; i < array.length; i++) {
			tmpsum = sum;
			tmpsum += array[i];
			if (tmpsum == key) return true;
			if (tmpsum < key) {
				if (check(array, i+1, tmpsum, key)) return true;
			}
		}
		return false;
	}
	
	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] A = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		int q = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");
		for (int i = 0; i < str.length; i++) {
			boolean flag = false;
			for (int j = 0; j < A.length; j++) {
				if (A[j] == Integer.parseInt(str[i])) {
					flag = true;
					break;
				}
				if (check(A, j+1, A[j], Integer.parseInt(str[i]))) {
					flag = true;
					break;
				}
				else flag = false;
			}
			if (flag) System.out.println("yes");
			else System.out.println("no");
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

