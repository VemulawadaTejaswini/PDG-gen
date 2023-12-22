import java.io.*;
import java.util.*;

public class Main {


	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int nextInt() throws IOException {
		return Integer.parseInt(br.readLine());
	}

	public static long nextLong() throws IOException {
		return Long.parseLong(br.readLine());
	}

	public static String next() throws IOException {
		return br.readLine();
	}

	public static int[] sortArr(int arr[]) throws IOException {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);

		Collections.sort(a);

		for (int i = 0; i < a.size(); i++)
			arr[i] = a.get(i);
		return arr;
	}

	public static int[] desortArr(int arr[]) throws IOException {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : arr)
			a.add(i);

		Collections.sort(a, Collections.reverseOrder());

		for (int i = 0; i < a.size(); i++)
			arr[i] = a.get(i);
		return arr;
	}

	public static int[] nextArr() throws IOException {
		String elements[] = br.readLine().split(" ");
		int arr[] = new int[elements.length];
		for (int j = 0; j < elements.length; j++)
			arr[j] = Integer.parseInt(elements[j]);
		return arr;
	}

	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) throws IOException {

		int T = 1;
		
		while (T-- > 0) {

			int n = nextInt();
			
			int arr[] = nextArr();

			int aux[] = new int[100003];

			long sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				aux[arr[i]]++;

			}

			int q = nextInt();

			for (int i = 0; i < q; i++) {
				int input[] = nextArr();
				int c = input[0];
				int d = input[1];
				long m = (long) d * aux[c];
				long o = (long) c * aux[c];
				
				sum += m - o;
				
				aux[d] += aux[c];
				aux[c] = 0;
				
				System.out.println(sum);
			}

		}
	}


}
