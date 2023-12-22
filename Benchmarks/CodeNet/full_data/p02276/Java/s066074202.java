import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();
		int[] a = new int[n];
    	for (int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    	}

//    	quickSort(a, 0, n -1);
    	int q = partition(a, 0, n - 1);

    	for (int i = 0; i < n; i++) {
    		if (i == q) {
    			pr.print("[");
    			pr.print(a[i]);
    			pr.print("]");
    		} else {
    			pr.print(a[i]);
    		}
    		if (i != n - 1) {
    			pr.printSP();
    		}
    	}

    	pr.close();
        sc.close();
	}
	
//	static void quickSort(int[] a, int p, int r) {
//		int q = partition(a, p ,r);
//		quickSort(a, p, q - 1);
//		quickSort(a, q + 1, r);
//	}
	
	static int partition(int [] a, int p, int r) {
		int x = a[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (a[j] <= x) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i + 1];
		a[i + 1] = a[r];
		a[r] = temp;

		return i + 1;
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
		OutputStreamWriter osw;
		BufferedWriter bw;
		StringBuffer strbuf;
		int bufSize;
		String CR;

		Printer(OutputStream out) {
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
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

		void printSP() {
			strbuf.append(" ");
//			checkStringBuffer();
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

			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		private void flashStringBuffer() {
			if (strbuf.length() > 0) {
				try {
					bw.write(strbuf.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
				strbuf.setLength(0);
			}
		}
		
		private void checkStringBuffer() {
			if (strbuf.length() > bufSize) {
				flashStringBuffer();
			}
		}
	}
}