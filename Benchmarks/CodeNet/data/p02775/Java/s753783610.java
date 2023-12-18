import java.util.*;
import java.io.*;

class Main{
  static PrintWriter out = new PrintWriter(System.out);
  static PrintWriter err = new PrintWriter(System.err);
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    long ans=0;
    boolean du=false;
//    Deque<Integer> dq=new ArrayDeque<>();
    for(int i=s.length()-1;i>=0;i--){
      int d=s.charAt(i)-'0';
      if(du){
        d++;
      }
      int su=d;
      int iv=10-d;
      if(su<iv+1){
        ans+=su;
        du=false;
//        dq.addFirst(su);
      }else{
        ans+=iv;
        du=true;
//        dq.addFirst(0);
      }
    }
    if(du){
      ans++;
//      dq.addFirst(1);
    }
    out.println(ans);
    out.flush();
    /*
    while(!dq.isEmpty()){
      err.print(dq.pollFirst());
    }
    err.println();
    err.flush();
    */
  }
}
