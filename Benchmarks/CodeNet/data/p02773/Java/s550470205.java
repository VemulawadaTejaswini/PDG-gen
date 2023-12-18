import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class Main { 
    public static void main(String[] args) {
        FastScanner sc=new FastScanner();
      	LinkedList<String> o=new LinkedList<>();
        int n=sc.nextInt();
        
      Map<String, Integer> hashmap = new HashMap<String, Integer>();
      for(int i=0;i<n;i++){
        String s=sc.next();
            if(hashmap.get(s)==null){
            	hashmap.put(s,1);
            }else{
            	hashmap.put(s,hashmap.get(s)+1);
            }     
        }
      List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(hashmap.entrySet());
        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
            //compareを使用して値を比較する
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
            {
                //降順
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        
        // 7. ループで要素順に値を取得する
        int ma=0;
        for(Entry<String, Integer> entry : list_entries) {
          if(ma==0)ma=entry.getValue();
          if(ma==entry.getValue())o.add(entry.getKey());
           // System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    Collections.sort(o);
      while(o.size()>0){
      	System.out.println(o.remove(0));
      }
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
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}