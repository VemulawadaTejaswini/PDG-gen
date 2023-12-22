import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] in = new int[n];
		for (int i = 0; i < n; i++)
			in[i] = Integer.parseInt(br.readLine());

		shellsort(in, n);
	}

	static int insertsort(int[] in) {
		int count = 0;
		for (int i = 0; i < in.length - 1; i++) {
			if (in[i] > in[i + 1]) {//if文?
				int tmp = in[i + 1];
                                count++;
				for (int j = i; j >= 0; j--) {
					if (in[j] > tmp) {//?と全く同じことが書いてある
						in[j + 1] = in[j];
						in[j] = tmp;
					} else break;					
				}
			}
		}
		return count;
	}

	static void shellsort(int[] in, int n) {
		System.out.println(n / 2);

		for (int i = 0; i < n / 2; i++) {
			for (int l = 0; l < 1; l++) {
				int j = i + n / 2;
				if (in[i] > in[j]) {
					int tmp = in[i];
					in[i] = in[j];
					in[j] = tmp;
				}
			}
		}
		StringBuilder stb = new StringBuilder(Integer.toString(in[0]));

		for (int i = 1; i < n / 2; i++)
			stb.append(" " + in[i]);
		System.out.println(stb.toString());
		System.out.println(insertsort(in));
		for (int i : in)
			System.out.println(i);

	}
}