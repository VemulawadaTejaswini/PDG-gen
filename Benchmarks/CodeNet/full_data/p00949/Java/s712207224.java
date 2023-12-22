import java.io.*;
import java.util.*;
public class Main {
	static long MOD = 2 << 29;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		String s1 = sc.next();
		String s2 = sc.next();
		int max = 0;
		int[] num = {321312,43254636,3123123,435782,1217453,
				     1237834732,12371213,3437832,123738473,2641412,
				     2124,12937,347823423,43758732,137231,
				     437834,23748732,1278734,127473,1222717,
				     786432,127641,232,137837,1278723,
				     23123213
				     };
		IN:for(int i =  Math.min(s1.length(), s2.length()); i >= 1; i--) {
			HashMap<Long, ArrayList<String>> map = new HashMap<Long,ArrayList<String>>();
			for(int j = 0; j <= s1.length() - i; j++) {
				
				long sum = 0;
				for(int k = j; k < i + j; k++) {
					sum += num[s1.charAt(k) - 'a'] % MOD;
				}
				if(map.containsKey(sum)) {
					ArrayList<String> l = map.get(sum);
					l.add(s1.substring(j,i + j));
					map.put(sum,l);
				}
				else {
					ArrayList<String> l = new ArrayList<String>();
					l.add(s1.substring(j,i + j));
					map.put(sum,l);
				}
			}
			
			for(int j = 0; j <= s2.length() - i; j++) {
				long sum = 0;
				for(int k = j; k < i + j; k++) {
					sum += num[s2.charAt(k) - 'a'] % MOD;
				}
				if(map.containsKey(sum)) {
					ArrayList<String> l = map.get(sum);
					for(int mm = 0; mm < l.size(); mm++) {
						String str = l.get(mm);
						l.remove(mm);
						char[] strc = str.toCharArray();
						Arrays.sort(strc);
						l.add(String.valueOf(strc));
					}
					Collections.sort(l);
					
					String str = s2.substring(j, i + j);
					char[] strc = str.toCharArray();
					Arrays.sort(strc);
					
					
					boolean check = Collections.binarySearch(l,String.valueOf(strc)) >= 0;
					if(check) {
						//System.out.println(s2.substring(j,i + j));
						max = i;
						break IN;
					}
					
				}
				else {
					continue;
				}
			}
			
		}
		System.out.println(max);
	}
	
	
}

class FastScanner {
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
    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
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
        if (!hasNext()) throw new NoSuchElementException();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}