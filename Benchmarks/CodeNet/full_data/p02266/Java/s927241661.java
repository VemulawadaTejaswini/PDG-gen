import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		char[] str = sc.next().toCharArray();
		
		int[] h = new int[2*str.length];
		int h_now = 0;
		for(int i=0; i<str.length; i++) {
			if(str[i] == '_') {
				h[2*i] = h_now;
				h[2*i + 1] = h_now;
			} else if(str[i] == '/') {
				h[2*i] = h_now;
				h[2*i + 1] = h_now + 1;
				h_now++;
			} else {
				// '\'
				h[2*i] = h_now;
				h[2*i + 1] = h_now - 1;
				h_now--;
			}
		}
		
		ArrayDeque<Integer> area = new ArrayDeque<>();
		boolean mode = false;
		int temp_h = 0;
		int temp_idx = 0;
		int temp_area = 0;
		for(int i=0; i<h.length; i++) {
			if(mode) {
				temp_area += temp_h - h[i];
				if(i == temp_idx) {
					area.add(temp_area / 2);
					temp_area = 0;
					mode = false;
				}
				
//				System.out.println(i + " " + mode + " " + temp_h + " " + temp_idx + " " + temp_area);
				
			} else {
				boolean flag = false;
				for(int j=i+1; j<h.length; j++) {
					if(flag == false && h[j] < h[i]) {
						flag = true;
					}
					if(flag == false && h[j] > h[i]) {
						break;
					}
					if(flag == true && h[j] == h[i]) {
						temp_h = h[i];
						temp_idx = j;
						mode = true;
						break;
					}
				}
				
//				System.out.println(i + " " + mode);
			}
		}
		
		int sum = 0;
		int[] iarea = new int[area.size()]; 
		for(int i=0; i<iarea.length; i++) {
			iarea[i] = area.poll();
			sum += iarea[i];
		}
		
		System.out.println(sum);
		
		System.out.print(iarea.length);
		if(iarea.length == 0) {
			System.out.print(" ");
		}
		
		for(int i=0; i<iarea.length; i++) {
			System.out.print(iarea[i]);
			if(i != iarea.length-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
	    private boolean hasNextByte() {
	        if (ptr < buflen) {
	            return true;
	        }else{
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
	    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
	    public String next() {
	        if (!hasNext()) throw new NoSuchElementException();
	        StringBuilder sb = new StringBuilder();
	        int b = readByte();
	        while(isPrintableChar(b)) {
	            sb.appendCodePoint(b);
	            b = readByte();
	        }
	        return sb.toString();
	    }
	    public long nextLong() {
	        return Long.parseLong(next());
	    }
	    public int nextInt(){
	    	return Integer.parseInt(next());
	    }
	}

}