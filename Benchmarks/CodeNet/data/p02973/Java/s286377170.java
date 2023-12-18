import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
//        PriorityQueue<FL> fllist = new PriorityQueue<FL>((a,b)->{
//          if(a.first != b.first) return a.first-b.first;
//          else return a.last-b.last;
//        });
        TreeSet<FL> fllist = new TreeSet<FL>((a,b)->{return a.last==b.last?(a.first==b.first?b.idx-a.idx:a.first-b.first):a.last-b.last;});
        FL flnow = null;
        int inow = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<N;i++){
          int n = Integer.parseInt(sc.next());
          if(flnow == null){
            flnow = new FL(i);
            flnow.first = n;
          }else if(inow >= n){
            flnow.last = inow;
            FL p = 	fllist.pollFirst();
            if(p!=null && p.last < flnow.first){
              p.last = inow;
              fllist.add(p);
            }else{
              fllist.add(flnow);
              if(p!=null) fllist.add(p);
            }
            flnow = new FL(i);
            flnow.first = n;
          }
          inow = n;
        }
        flnow.last = inow;
        FL p = 	fllist.pollFirst();
        if(p!=null && p.last < flnow.first){
          p.last = inow;
          fllist.add(p);
        }else{
          fllist.add(flnow);
          if(p!=null)fllist.add(p);
        }
//        for(FL fff:fllist) System.out.println(fff.toString());
        System.out.println(fllist.size());
    }
    static class FL{
      public int first = -1, last = -1, idx = -1;
      FL(int idx){this.idx = idx;}
      public String toString(){
        return new StringBuilder().append(first).append(" ").append(last).toString();
      }
    }
}
