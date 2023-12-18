import java.util.*;
import static java.util.Objects.isNull;

import java.io.*;


public class Main{
   public static void main(String[] args){
        FastScanner fsc = new FastScanner();
        int n=fsc.nextInt();
        int[] nummap=new int[n];
        for(int i=0;i<n;i++) nummap[fsc.nextInt()-1]++;
        int[] num=new int[n+1];
        for(int i=0;i<n;i++) num[nummap[i]]++;
        ArrayDeque<Pair> org=new ArrayDeque<>();
        for(int i=1;i<=n;i++) if(num[i]>0) org.addFirst(new Pair(i, num[i]));
        StringBuilder sb=new StringBuilder();
        for(int m=1;m<=n;m++){
            int k=m;
            ArrayDeque<Pair> now=new ArrayDeque<>();
            Iterator<Pair> it=org.iterator();
            while(it.hasNext()) now.addLast(it.next().clone());
            int cnt=0;
            // System.out.println(m);
            Out:while(true){
                // for(Pair p:now){
                //     // System.out.print(p.k+"=>"+p.v+" ");
                //     for(int i=0;i<p.v;i++){
                //         System.out.print(p.k+" ");
                //     }
                // }
                System.out.println();
                ArrayDeque<Pair> next=new ArrayDeque<>();
                In:while(true){
                    Pair p=now.pollFirst();
                    if(isNull(p)) break Out;
                    if(p.v<k){
                        k-=p.v;
                        if(p.k>1) next.addFirst(new Pair(p.k-1, p.v));
                    } else{
                        if(!next.isEmpty() && next.getFirst().k==p.k) next.getFirst().v+=p.v-k;
                        else next.addFirst(new Pair(p.k, p.v-k));
                        if(p.k>1){
                            if(!now.isEmpty() && now.getFirst().k==p.k-1) now.getFirst().v+=k;
                            else next.addFirst(new Pair(p.k-1, k));
                        }
                        break In;
                    }
                }
                while(!next.isEmpty()){
                    Pair p=next.pollFirst();
                    now.addFirst(p);
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

class Pair implements Cloneable{
    public int k, v;
    public Pair(int k, int v){
        this.k=k;
        this.v=v;
    }
    public Pair clone(){
        return new Pair(k, v);
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
