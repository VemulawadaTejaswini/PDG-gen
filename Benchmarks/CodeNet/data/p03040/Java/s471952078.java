import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        MyLong MAX=new MyLong(1_000_000_000l);
        FastScanner fsc=new FastScanner();
        int q=fsc.nextInt();
        long bsum=0;
        long min=0;
        TreeSet<MyLong> fir=new TreeSet<>();
        fir.add(MAX.mlm(-1));
        TreeSet<MyLong> sec=new TreeSet<>();
        sec.add(MAX);
        StringBuilder sb=new StringBuilder();
        boolean rm=false;
        for(int i=0;i<q;i++){
            int query=fsc.nextInt();
            if(query==1){
                MyLong am=new MyLong(fsc.nextLong()), bm=new MyLong(fsc.nextLong());
                MyLong.incr();
                bsum+=bm.l;
                MyLong fl=fir.last();
                MyLong sf=sec.first();
                if(!(fl.l(am.l) && sf.g(am.l))){
                    min+=Math.min(Math.abs(fl.ls(am.l)), Math.abs(sf.ls(am.l)));
                    if(fl.geq(am.l)){
                        if(rm) fir.pollLast();
                        fir.add(am);
                    }
                    else{
                        if(rm) sec.pollFirst();
                        sec.add(am);
                    }
                    rm=false;
                }
                else{
                    fir.add(am);
                    sec.add(am);
                    rm=true;
                }
                while(fir.size()-sec.size()>1) sec.add(fir.pollLast());
                while(sec.size()-fir.size()>1) fir.add(sec.pollFirst());
            }
            else sb.append(fir.last().l).append(" ").append(min+bsum).append("\n");
        }
        fsc.close();
        System.out.print(sb);
    }
}
class MyLong implements Comparable{
    long l;
    static long count=0;
    MyLong(long l){this.l=l;}
    @Override public String toString(){return String.valueOf(l*count+l);}
    public int compareTo(Object o){
        if(!(o instanceof MyLong)) return 0;
        MyLong ml=(MyLong) o;
        return l>=ml.l?1:-1;
    }
    public static void incr(){count++;}
    public MyLong mlp(long l){return new MyLong(this.l+l);}
    public MyLong mls(long l){return new MyLong(this.l-l);}
    public MyLong mlm(long l){return new MyLong(this.l*l);}
    public MyLong mld(long l){return new MyLong(this.l/l);}
    public long lp(long l){return this.l+l;}
    public long ls(long l){return this.l-l;}
    public long lm(long l){return this.l*l;}
    public long ld(long l){return this.l/l;}
    public boolean g(long l){return this.l>l;}
    public boolean l(long l){return this.l<l;}
    public boolean geq(long l){return this.l>=l;}
    public boolean leq(long l){return this.l<=l;}
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr<buflen) return true;
        else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }
            catch(IOException e){
                e.printStackTrace();
            }
            if(buflen<=0) return false;
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
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }
            else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
    public void close(){
        try{in.close();}
        catch(IOException e){e.printStackTrace();}
    }
}