import java.util.*;
import java.util.Map.Entry;
import static java.util.Comparator.reverseOrder;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

import java.io.*;


@SuppressWarnings("unchecked")
public class Main{
   public static void main(String[] args){
        FastScanner fsc = new FastScanner();
        int n=fsc.nextInt();
        int[] nummap=new int[n];
        for(int i=0;i<n;i++) nummap[fsc.nextInt()-1]++;
        int[] num=new int[n+1];
        for(int i=0;i<n;i++) num[nummap[i]]++;
        TreeMap<Integer, Integer> tm=new TreeMap<>(reverseOrder());
        for(int i=1;i<=n;i++) if(num[i]>0) tm.put(i, num[i]);
        StringBuilder sb=new StringBuilder();
        for(int m=1;m<=n;m++){
            int k=m;
            TreeMap<Integer, Integer> now=(TreeMap<Integer, Integer>) tm.clone();
            int cnt=0;
            // System.out.println(m);
            Out:while(true){
                // for(Entry<Integer, Integer> et:now.entrySet()){
                //     for(int i=0;i<et.getValue();i++){
                //         System.out.print(et.getKey()+" ");
                //     }
                // }
                // System.out.println();
                TreeMap<Integer, Integer> next=new TreeMap<>(reverseOrder());
                In:while(true){
                    Entry<Integer, Integer> e=now.pollFirstEntry();
                    if(isNull(e)) break Out;
                    int key=e.getKey();
                    int val=e.getValue();
                    if(val<k){
                        k-=val;
                        if(key>1) next.put(key-1, val);
                    } else{
                        Integer v=next.putIfAbsent(key, val-k);
                        if(nonNull(v)) next.put(key, v+val-k);
                        if(key>1) next.put(key-1, k+(now.containsKey(key-1)?now.get(key-1):0));
                        break In;
                    }
                }
                while(!next.isEmpty()){
                    Entry<Integer, Integer> e=next.pollFirstEntry();
                    now.put(e.getKey(), e.getValue());
                }
                k=m;
                cnt++;
            }
            // System.out.println();
            sb.append(cnt).append('\n');
        }
        System.out.print(sb);
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
