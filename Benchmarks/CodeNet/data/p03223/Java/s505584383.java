import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.*;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        int n=scanner.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextLong();
        }
        Arrays.sort(a);
        Deque<Long> deque=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            deque.addLast(a[i]);
        }
        if(n%2!=0){
            Deque<Long> deque1=((ArrayDeque<Long>) deque).clone();
            List<Long> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(deque.size()==1) break;
                if(i%2==0){
                    long num=deque.removeFirst();
                    list.add(num);
                }else{
                    long num=deque.removeLast();
                    list.add(num);
                }
            }
            List<Long> list1=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(deque1.size()==1) break;
                if(i%2==0){
                    long num=deque1.removeLast();
                    list1.add(num);
                }else{
                    long num=deque1.removeFirst();
                    list1.add(num);
                }
            }
            List<Long> list2=(ArrayList<Long>) ((ArrayList<Long>) list).clone();
            List<Long> list3=(ArrayList<Long>) ((ArrayList<Long>) list1).clone();
            list.add(deque.getFirst());
            list1.add(deque.getFirst());
            list2.add(0,deque.getFirst());
            list3.add(0,deque.getFirst());
            long result=max(func(list),max(func(list1),max(func(list2),func(list3))));
            put(result);

        }else{
            Deque<Long> deque1=((ArrayDeque<Long>) deque).clone();
            List<Long> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(deque.size()==2) break;
                if(i%2==0){
                    long num=deque.removeFirst();
                    list.add(num);
                }else{
                    long num=deque.removeLast();
                    list.add(num);
                }
            }
            List<Long> list1=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(deque1.size()==2) break;
                if(i%2==0){
                    long num=deque1.removeLast();
                    list1.add(num);
                }else{
                    long num=deque1.removeFirst();
                    list1.add(num);
                }
            }
            //list
            List<Long> list2=(ArrayList<Long>) ((ArrayList<Long>) list).clone();
            List<Long> list3=(ArrayList<Long>) ((ArrayList<Long>) list).clone();
            List<Long> list4=(ArrayList<Long>) ((ArrayList<Long>) list).clone();
            List<Long> list5=(ArrayList<Long>) ((ArrayList<Long>) list).clone();
            List<Long> list6=(ArrayList<Long>) ((ArrayList<Long>) list).clone();
            //list1
            List<Long> list7=(ArrayList<Long>) ((ArrayList<Long>) list1).clone();
            List<Long> list8=(ArrayList<Long>) ((ArrayList<Long>) list1).clone();
            List<Long> list9=(ArrayList<Long>) ((ArrayList<Long>) list1).clone();
            List<Long> list10=(ArrayList<Long>) ((ArrayList<Long>) list1).clone();
            List<Long> list11=(ArrayList<Long>) ((ArrayList<Long>) list1).clone();

            long num1=deque1.getFirst();
            long num2=deque.getLast();
            list.add(0,num1);
            list.add(0,num2);
            list1.add(0,num1);
            list1.add(0,num2);

            list2.add(0,num2);
            list2.add(0,num1);
            list7.add(0,num2);
            list7.add(0,num1);

            list3.add(0,num1);
            list3.add(num2);
            list8.add(0,num1);
            list8.add(num2);

            list4.add(num1);
            list4.add(0,num2);
            list9.add(num1);
            list9.add(0,num2);

            list5.add(num1);
            list5.add(num2);
            list10.add(num1);
            list10.add(num2);

            list6.add(num2);
            list6.add(num1);
            list11.add(num2);
            list11.add(num1);

            long result=func2(list,list1,list2,list3,list4,list5,list6,list7,list8,list9,list10,list11);
            put(result);

        }

    }

    public static long func(List<Long> ll){
        long result=0;
        for(int i=0;i<ll.size()-1;i++){
            result+=abs(ll.get(i+1)-ll.get(i));
        }
        return result;
    }
    public static long func(Long[] la){
        List<Long> ll=new ArrayList<>();
        for(int i=0;i<la.length;i++){
            ll.add(la[i]);
        }
        return func(ll);
    }
    public static long func2(List<Long>... arg){
        long result=0;
        for(int i=0;i<arg.length;i++){
            result=max(result,func(arg[i]));
        }
        return result;
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


    public static int max(int a,int b){
        return Math.max(a,b);
    }
    public static long max(long a,long b){
        return Math.max(a,b);
    }
    public static int min(int a,int b){
        return Math.min(a,b);
    }
    public static long min(long a,long b){
        return Math.min(a,b);
    }
    public static int abs(int a){
        return Math.abs(a);
    }
    public static long abs(long a){
        return Math.abs(a);
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
    public static String format(String string, Object... args) {
        return String.format(string, args);
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
    final private int x, y;
    final static public FixedPair ZEROS=new FixedPair(0,0);
    FixedPair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return x+y;
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
        if(a%b==0)return b;
        return gcd(b,a%b);
    }
    static long lcm(long a,long b){
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
    static String toStringBWS(int[] array){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<array.length-1;i++){
            sb.append(array[i]);
            sb.append(" ");
        }
        sb.append(array[array.length-1]);
        return sb.toString();
    }
    static String toStringBWS(long[] array){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<array.length-1;i++){
            sb.append(array[i]);
            sb.append(" ");
        }
        sb.append(array[array.length-1]);
        return sb.toString();
    }
}
