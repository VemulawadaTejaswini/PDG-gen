import java.util.*;import java.util.stream.*;public class Main{public static void main(String[] g){Scanner c=new Scanner(System.in);int n=c.nextInt();int[] a=IntStream.range(0,n).map(i->c.nextInt()).toArray();int s=Arrays.stream(a).sum();BitSet b=new BitSet();b.set(s);IntStream.range(0,n).forEach(i->b.or(b.get(a[i],s+1)));System.out.println(b.nextSetBit((s+1)/2));}}

