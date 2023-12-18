import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
       InputReader in = new InputReader(System.in);
       int n = in.readInt(); 
       HashMap<String ,Integer> map = new HashMap<>(); 
       
       for(int i =0; i<n; i++) {
    	   String s = in.readString();
    	   if(map.containsKey(s)) {
    		    map.put(s, map.get(s) + 1);
    	   }
    	   else  map.put(s, 1);
       }
        
       HashSet<String> votes = new HashSet<>(); 
       
       int max = Integer.MIN_VALUE; 
       for(Map.Entry<String, Integer> entry: map.entrySet()) {
    	   if(max <= entry.getValue()) {
    		   max = entry.getValue();
    	   }
       }
       for(Map.Entry<String , Integer> entry: map.entrySet()) {
    	   if(entry.getValue() == max) {
    		   votes.add(entry.getKey()); 
    	   }
       }
    	 ArrayList<String> list = new ArrayList<>(votes); 
       Collections.sort(list);
       for(String i : list) {
    	   System.out.println(i); 
       }
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
