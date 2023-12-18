import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FScanner sc = new FScanner();
		int N = sc.nextInt();
		int[] L = new int[N];
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}

		System.out.println(findNumberOfTriangles(L));
	}

	public static int findNumberOfTriangles(int arr[]) {
		int n = arr.length;
		// Sort the array elements in non-decreasing order
		Arrays.sort(arr);

		// Initialize count of triangles
		int count = 0;

		// Fix the first element. We need to run till n-3 as
		// the other two elements are selected from arr[i+1...n-1]
		for (int i = 0; i < n - 2; ++i) {
			// Initialize index of the rightmost third element
			int k = i + 2;

			// Fix the second element
			for (int j = i + 1; j < n; ++j) {
				/* Find the rightmost element which is smaller
				than the sum of two fixed elements
				The important thing to note here is, we use
				the previous value of k. If value of arr[i] +
				arr[j-1] was greater than arr[k], then arr[i] +
				arr[j] must be greater than k, because the
				array is sorted. */
				while (k < n && arr[i] + arr[j] > arr[k])
					++k;

				/* Total number of possible triangles that can be
				formed with the two fixed elements is k - j - 1.
				The two fixed elements are arr[i] and arr[j]. All
				elements between arr[j+1] to arr[k-1] can form a
				triangle with arr[i] and arr[j]. One is subtracted
				from k because k is incremented one extra in above
				while loop. k will always be greater than j. If j
				becomes equal to k, then above loop will increment
				k, because arr[k] + arr[i] is always/ greater than
				arr[k] */
				if (k > j)
					count += k - j - 1;
			}
		}
		return count;
	}

}

class MyComparator implements Comparator {
	@Override
	public int compare(Object arg0, Object arg1) {
		long x = (long) arg0;
		long y = (long) arg1;

		if (x < y) {
			return 1;
		} else if (x > y) {
			return -1;
		} else {
			return 0;
		}
	}
}

class FScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}