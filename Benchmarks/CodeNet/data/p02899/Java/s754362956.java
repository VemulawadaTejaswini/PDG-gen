import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.Map.Entry;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        int mennum = reader.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < mennum ; i++) {
        	int num = reader.nextInt();
        	map.put(i + 1, num);
        }
List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        
        // 3.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                // 4. 昇順
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });
        for(Entry<Integer, Integer> entry : list_entries) {
            System.out.println(entry.getKey());
        }
    }

    // Read Class
    static class FS {
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
    
        private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
        private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
        private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    
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
        public int nextInt() {
            return (int)nextLong();
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
            while(true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if(b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
    }
}

