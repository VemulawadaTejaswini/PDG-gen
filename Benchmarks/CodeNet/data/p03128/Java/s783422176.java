
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;

import static java.lang.String.format;


public class Main {
    static int n;
    static List<FixedPair> fpList;
    static Map<Integer,Integer> map=new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner();
        n=scanner.nextInt();
        int m=scanner.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=scanner.nextInt();
        }
        int[] b=new int[]{2,5,5,4,5,6,3,7,6};
        fpList=new ArrayList<>();
        for(int x:a){
            //put(format("x:%d",x));
            fpList.add(new FixedPair(x,b[x-1]));
        }
        //put(fpList);
        Collections.sort(fpList,Comparator.comparing((FixedPair fp)->fp.getY()).thenComparing(fixedPair -> -fixedPair.getX()));
        for(FixedPair fp:fpList){
            if(!map.containsKey(fp.getX())){
                map.put((int)fp.getX(),(int)fp.getY());
            }
        }
        Iterator<FixedPair> itr=fpList.iterator();
        int cost=-1;
        while(itr.hasNext()){
            FixedPair fp=itr.next();
            if(cost== fp.getY()){
                itr.remove();
            }
            cost=(int)fp.getY();
        }
        List<Integer> ansList=new ArrayList<>();
        ansList=dfs(ansList,0,0);
        Collections.sort(ansList,Comparator.reverseOrder());
        StringBuilder sb=new StringBuilder();
        for(int x:ansList){
            sb.append(x);
        }
        put(sb);

    }
    public static List<Integer> dfs(List<Integer> list,int sum,int index){
        //put(list);
        if(list==null) return null;
        // put(format("sum:%d",sum));
        if(sum==n){
            return list;
        }
        for(int i=index;i<fpList.size();i++){
            FixedPair fp=fpList.get(i);
            if(n-sum>=fp.getY()){
                List<Integer> copy=new ArrayList<>(list);
                copy.add((int)fp.getX());
                copy=dfs(copy,sum+(int)fp.getY(),i);
                if(copy!=null){
                    return copy;
                }
            }else{
                return null;
            }
        }
        return null;

    }


    public static int upper_bound(int[] a,int val){
        return upper_bound(a,0,a.length,val);
    }
    public static int upper_bound(int[] a,int l,int r,int val){
        if(r-l==1){
            if(a[l]>val) return l;
            return r;
        }
        int mid=(l+r)/2;
        if(a[mid]>val){
            return upper_bound(a,l,mid,val);
        }else{
            return upper_bound(a,mid,r,val);
        }
    }
    public static <T> int upper_bound(T[] a,int l,int r,T val,Comparator<T> comparator){
        if(r-l==1){
            if(comparator.compare(a[l],val)>0) return l;
            return r;
        }
        int mid=(l+r)/2;
        if(comparator.compare(a[mid],val)>0){
            return upper_bound(a,l,mid,val,comparator);
        }else{
            return upper_bound(a,mid,r,val,comparator);
        }
    }
    public static int lower_bound(int[] a,int val){
        return lower_bound(a,0,a.length,val);
    }
    public static int lower_bound(int[] a,int l,int r,int val){
        if(r-l==1){
            if(a[l]<val) return r;
            return l;
        }
        int mid=(l+r)/2;
        if(a[mid]<val){
            return lower_bound(a,mid,r,val);
        }else{
            return lower_bound(a,l,mid,val);
        }

    }

    public static <T> int lower_bound(T[] a,int l,int r,T val,Comparator<T> comparator){
        if(r-l==1){
            if(comparator.compare(a[l],val)<0) return r;
            return l;
        }
        int mid=(l+r)/2;
        if(comparator.compare(a[mid],val)<0){
            return lower_bound(a,mid,r,val,comparator);
        }else{
            return lower_bound(a,l,mid,val,comparator);
        }
    }


    public static void print(Object object){
        System.out.print(object);
    }
    public static void put(Object object) {
        System.out.println(object);
    }
    public static void put(){
        System.out.println();
    }
}

final class Scanner {
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

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
final class FixedPair {
    final private long x, y;
    final static public FixedPair ZEROS=new FixedPair(0,0);
    FixedPair(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return (int)x+(int)y;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=super.equals(obj);
        if(obj.getClass()!=this.getClass()){
            return false;
        }
        FixedPair pair=(FixedPair)obj;
        if(this.x==pair.x&&this.y==pair.y) return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
final class Tuple<T,V>{
    //immutabl1でないことに注意(T,Vがmutableの場合変更可能)
    final private T t;
    final private V v;
    Tuple(T t,V v){
        this.t=t;
        this.v=v;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    @Override
    public int hashCode() {
        return (t.hashCode()+v.hashCode());
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {
        if(obj.getClass()!=this.getClass()){
            return false;
        }
        Tuple<T,V> tuple=(Tuple<T, V>) obj;
        return tuple.t.equals(this.t)&&tuple.v.equals(this.v);
    }

    @Override
    public String toString() {
        return String.format("<Tuple>=<%s,%s>",t,v);
    }
}
final class LowerBoundComparator<T extends Comparable<? super T>>
        implements Comparator<T>
{
    public int compare(T x, T y)
    {
        return (x.compareTo(y) >= 0) ? 1 : -1;
    }
}

final class UpperBoundComparator<T extends Comparable<? super T>>
        implements Comparator<T>
{
    public int compare(T x, T y)
    {
        return (x.compareTo(y) > 0) ? 1 : -1;
    }
}
final class Util {
    static long gcd(long a,long b){
        //最大公約数　
        if(a%b==0)return b;
        return gcd(b,a%b);
    }
    static long lcm(long a,long b){
        //最小公倍数
        long gcd=gcd(a,b);
        long result=b/gcd;
        return a*result;
    }
    static long kaijoMod(int n,int mod){
        if(n<1) return -1;
        long result=1;
        for(int i=n;i>1;i--){
            result*=i;
            result%=mod;
        }
        return result;
    }
    static <T extends Comparable<T>> Map<T,Integer> count(List<T> list){
        //副作用
        Collections.sort(list);
        Map<T,Integer> result=new HashMap<>();
        int l=0,r=0;
        while(l<list.size()){
            while(r<list.size()-1&&list.get(r).equals(r+1)){
                r++;
            }
            result.put(list.get(r),r-l+1);
            r++;
            l=r;
        }
        return result;

    }
    static Map<Integer,Integer> count(int[] array){
        //副作用
        Arrays.sort(array);
        Map<Integer,Integer> result=new HashMap<>();
        int l=0,r=0;
        while(l<array.length){
            while(r<array.length-1&&array[r]==array[r+1]){
                r++;
            }
            result.put(array[l],r-l+1);
            r++;
            l=r;
        }
        return result;
    }
    static <T> String toStringBWS(Iterable<T> iterable){
        Iterator<T> ite=iterable.iterator();
        return toStringBWS(ite);
    }
    static <T> String toStringBWS(Iterator<T> ite){
        StringBuilder sb=new StringBuilder();
        sb.append(ite.next());
        while(ite.hasNext()){
            sb.append(" ");
            sb.append(ite.next());
        }
        return sb.toString();
    }
    static int[] factoringInPrimeNumbers(long n,int size){
        //素因数分解
        //sizeがnに比べて小さい場合完全に素因数分解出来ていない可能性がある
        int[] result=new int[size];
        for(int i=2;n>1&&i< result.length;i++){
            while(n%i==0){
                result[i]++;
                n/=i;
            }
        }
        return result;

    }
}
