import java.io.*;
import java.util.*;
import java.lang.*;

class Pair<E,F>{
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
}
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Pair<Long,Long>[] robots = new Pair[N];
        for(int n=0; n<N; n++){
            long X = sc.nextLong();
            long L = sc.nextLong();
            robots[n] = new Pair<>(X-L,X+L);
        }
        Arrays.sort(robots, (x,y)->x.second!=y.second ? Long.compare(x.second,y.second) : Long.compare(x.first,y.first));

        long right = -2000000000L;
        int ans = 0;
        for(int n=0; n<N; n++){
            if(robots[n].first >= right){
                right = robots[n].second;
                ans++;
            }
        }
        System.out.println(ans);

    }


}
