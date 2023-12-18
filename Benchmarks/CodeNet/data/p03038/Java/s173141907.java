import java.util.*;
import java.lang.*;

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

    static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        PriorityQueue<Pair<Long,Long>> cards = new PriorityQueue<>(Collections.reverseOrder());
        for(int n=0; n<N; n++){
            long a = sc.nextLong();
            cards.add(new Pair<>(a,1L));
        }
        for(int m=0; m<M; m++){
            long b = sc.nextLong();
            long c = sc.nextLong();
            cards.add(new Pair<>(c,b));
        }

        long ans = 0;
        while(N>0){
            Pair<Long,Long> largest = cards.poll();
            long elements=largest.getFirst(), amount=largest.getSecond();
            ans += elements * Math.min(amount, N);
            N -= amount;
        }

        System.out.println(ans);

    }
}