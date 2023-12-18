import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        PriorityQueue<FL> fllist = new PriorityQueue<FL>((a,b)->{
          if(a.first != b.first) return a.first-b.first;
          else return a.last-b.last;
        });
        FL flnow = null;
        int inow = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
          int n = Integer.parseInt(sc.next());
          if(flnow == null){
            flnow = new FL();
            flnow.first = n;
          }else if(inow >= n){
            flnow.last = inow;
            fllist.add(flnow);
            flnow = new FL();
            flnow.first = n;
          }
          inow = n;
        }
        flnow.last = inow;
        fllist.add(flnow);
        int ans = 0;
        int jnow = Integer.MAX_VALUE;
        while(!fllist.isEmpty()){
          FL ff = fllist.poll();
          if(ff.first <= jnow) ans++;
          jnow = ff.last;
        }
        System.out.println(ans);
    }
    static class FL{
      public int first = -1, last = -1;
      public String toString(){
        return new StringBuilder().append(first).append(" ").append(last).toString();
      }
    }
}
