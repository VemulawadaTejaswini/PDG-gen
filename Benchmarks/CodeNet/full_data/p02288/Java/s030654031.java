import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
    	}

		Heap heap = new Heap(data);
		
		heap.buildMaxHeapify();
		
		pr.println(heap.toString());
		
    	pr.close();
        sc.close();
	}

	private static class Heap {
		int[] a;
		int heap_size;
		
		Heap(int[] heap) {
			a = heap;
			heap_size = a.length;
		}

		int left(int i) {
			return i * 2;
		}

		int right(int i) {
			return i * 2 + 1;
		}

		void maxHeapify(int i) {
			int l = left(i);
			int r = right(i);
			int largest;
			if (l <= heap_size && a[l - 1] > a[i - 1]) {
				largest = l;
			} else {
				largest = i;
			}
			if (r <= heap_size && a[r - 1] > a[largest - 1]) {
				largest = r;
			}
			if (largest != i) {
				int temp = a[i - 1];
				a[i - 1] = a[largest - 1];
				a[largest - 1] = temp;
				maxHeapify(largest);
			}
		}

		void buildMaxHeapify() {
			for (int i = heap_size / 2; i >= 1; i--) {
				maxHeapify(i);
			}
		}
		
		@Override
		public String toString() {
			StringBuffer str = new StringBuffer();

			for (int i = 0; i < a.length; i++) {
				str.append(" ");
				str.append(a[i]);
			}
			
			return str.toString();
		}
}
	
	private static class Scanner {
		InputStreamReader isr;
		BufferedReader br;
		StreamTokenizer st;
		
		Scanner (InputStream in) {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			st = new StreamTokenizer(br);
		}
		
		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return st.sval;
		}
		
		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return (int)st.nval;
		}

		void close() {
		}
	}
	
	private static class Printer {
		PrintStream out;
		StringBuffer strbuf;
		int bufSize;
		final String CR;

		Printer(PrintStream out) {
			this.out = out;
			strbuf = new StringBuffer();
			bufSize = 64 * 1024;
			CR = System.getProperty("line.separator");
		}

		void println(String str) {
			strbuf.append(str);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(String str) {
			strbuf.append(str);
			checkStringBuffer();
		}

		void println(int n) {
			strbuf.append(n);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(int n) {
			strbuf.append(n);
			checkStringBuffer();
		}

		void print(char c) {
			strbuf.append(c);
			checkStringBuffer();
		}

		void printArray(int[] array) {
			for (int i = 0; i < array.length; i++) {
				checkStringBuffer();
				strbuf.append(array[i]);
				strbuf.append(" ");
			}
			strbuf.delete(strbuf.length() - 1, strbuf.length());
			strbuf.append(CR);
		}

		void close() {
			flashStringBuffer();
		}
		
		private void flashStringBuffer() {
			if (strbuf.length() > 0) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
		
		private void checkStringBuffer() {
			if (strbuf.length() > bufSize) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
	}
}