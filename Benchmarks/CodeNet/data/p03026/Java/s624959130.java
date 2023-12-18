import java.util.*;
import java.lang.*;

class Counter<T> extends HashMap<T,Integer>{
    public Counter(){
        super();
    }
    public Integer get(Object elm){
        return getOrDefault(elm,0);
    }
    public void add(T elm, int amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
    }
    public void addOne(T elm){
        add(elm, 1);
    }
    public void remove(T elm, int amount){
        replace(elm, Math.max(get(elm)-amount, 0));
    }
    public void removeOne(T elm){
        remove(elm, 1);
    }
}
class Pair<E extends Comparable<E>,F extends Comparable<F>> implements Comparable<Pair<E,F>>{
    E first;
    F second;
    public Pair(E first, F second){
        this.first=first;
        this.second=second;
    }
    public E getFirst(){return first;}
    public F getSecond(){return second;}
    public String toString(){
        return "<"+first.toString()+","+second.toString()+">";
    }
    public int hashCode(){
        return first.hashCode()*30011+second.hashCode()+2;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair another = (Pair) obj;
        return this.getFirst().equals(another.getFirst())&&this.getSecond().equals(another.getSecond());
    }

    public int compareTo(Pair<E,F> another){
        if(this.getFirst().equals(another.getFirst())){
            return this.getSecond().compareTo(another.getSecond());
        }
        return this.getFirst().compareTo(another.getFirst());
    }

}

public class Main {
    static void printArray(long[] ar){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + (i+1==ar.length ? "\n" : " "));

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N-1];
        int[] B = new int[N-1];
        long[] C = new long[N];
        for(int n=0; n<N-1; n++){
            A[n]=sc.nextInt()-1; B[n]=sc.nextInt()-1;
        }
        for(int n=0; n<N; n++) C[n]=sc.nextLong();
        Arrays.sort(C);

        Counter<Integer> count = new Counter<>();
        for(int n=0; n<N-1; n++){
            count.addOne(A[n]);
            count.addOne(B[n]);
        }

        PriorityQueue<Pair<Integer,Integer>> p = new PriorityQueue<>();
        for(int v: count.keySet()) p.add(new Pair<>(count.get(v), v));



        long[] ans = new long[N];
        for(int n=0; n<N; n++){
            ans[p.poll().getSecond()] = C[n];
        }

        long sum = 0;
        for(int n=0; n<N-1; n++) sum += Math.min(ans[A[n]], ans[B[n]]);
        System.out.println(sum);
        printArray(ans);
    }
}