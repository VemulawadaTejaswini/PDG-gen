import java.util.*; 
import java.io.*; 


public class Main {
	public static void main(String[] args) throws IOException { 
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[3]; 
       for(int i = 0; i<3; i++) {
    	   arr[i] = sc.nextInt(); 
       }
       Utils.swapArray(arr, 0, 1);
       Utils.swapArray(arr, 0, 2);
       System.out.println(arr[0] + " " + arr[1] + " " + arr[2]); 
    }
}
class InputReader {

	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	public InputReader(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public int readInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public String readString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	public long readLong() {
		int c = read();
		while (isSpaceChar(c)) {
			c = read();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			if (c < '0' || c > '9') {
				throw new InputMismatchException();
			}
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
	
	public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public String next() {
		return readString();
	}

	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}

class OutputWriter {
	private final PrintWriter writer;

	public OutputWriter(OutputStream outputStream) {
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
	}

	public OutputWriter(Writer writer) {
		this.writer = new PrintWriter(writer);
	}

	public void print(Object... objects) {
		for (int i = 0; i < objects.length; i++) {
			if (i != 0)
				writer.print(' ');
			writer.print(objects[i]);
		}
	}

	public void println(Object... objects) {
		print(objects);
		writer.println();
	}

	public void close() {
		writer.close();
	}

	public void flush() {
		writer.flush();
	}

}

class Utils {
/////////////////////////////////////////////////////////////////////////////////////////////
	
///////////////////////////////  HEAP SORT ALGORITHM ////////////////////////////////////////////
	
	static void heapSort(int arr[]) { 
		build_maxheap(arr,arr.length);
		for(int i = arr.length-1; i>=1; i--) {
			Utils.swapArray(arr, 0, i); 
			max_heapify(arr,0,i);
		}
	}
	

	static void build_maxheap(int Arr[], int N) {
		for (int i = N/2; i >= 0; i--) {
			max_heapify(Arr, i, N);
		}
	}

	static void max_heapify(int Arr[], int i, int N) {
		int largest = i;
		int left = 2 * i + 1; // left child
		int right = 2 * i + 2; // right child
		if (left < N && Arr[left] > Arr[i])
			largest = left;
		else
			largest = i;
		if (right < N && Arr[right] > Arr[largest])
			largest = right;
		if (largest != i) {
			Utils.swapArray(Arr, i, largest);
			max_heapify(Arr, largest, N);
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////  INDEX BASED ARRAY SWAPPING  //////////////////////////////////
	
    public static void swapArray(int arr[] , int xindex, int yindex) {
    	arr[xindex] = arr[xindex] ^ arr[yindex];
    	arr[yindex] = arr[xindex] ^ arr[yindex];
    	arr[xindex] = arr[xindex] ^ arr[yindex];
    }
    
////////////////////////////////////////////////////////////////////////////////////////////
    
/////////////////////////  READING INTEGER ARRAY  //////////////////////////////////////////
	public static int[] readIntArray(InputReader in, int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = in.readInt();
		return array;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////  SEIVE OF ERATOSTHENES  //////////////////////////////////////////
	static ArrayList<Integer> getPrimes(int n) {
		boolean primes[] = new boolean[n+10];
		for(int i = 0;i<n+10; i++) {
			primes[i] = true; 
		}
		for(int i = 2; i*i < n; i++) {
			if(primes[i] == true)
				for(int j = i*i; j<=n; j += i)
					primes[j] = false; 
		}
		ArrayList<Integer> p = new ArrayList<>(); 
		  for(int i = 2; i<=n; i++) {
			  if(primes[i] == true) p.add(i); 
		}
		return p;
	}
}

//////////////////////////////////PAIR CLASS   ///////////////////////////////////////
class pair implements Comparable<pair> {
	int first;
	int second;

	pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
    public int getFirst() {
    	return first; 
    }
    public int getSecond() {
    	return second; 
    }
	public String toString() {
		return first + " " + second;
	}

	public boolean equals(Object o) {
		return o instanceof pair && ((pair) o).first == first && ((pair) o).second == second;
	}

	public int compareTo(pair a) {
		return Integer.compare(second, a.second);
	}
}
//////////////////////////////////////////////////////////////////////////////////////

///////////////////   VERTEX CLASS FOR GRAPH  ///////////////////////////////////////
class vertex{
	 int index; 
	 long distance; 
	 int parent; 
	 Set<pair> adj; 
	 	 
	 vertex(int i){
		 index = i;
		 distance = Long.MAX_VALUE;
		 parent = i; 
		 adj = new HashSet<pair>();
	 }
}
