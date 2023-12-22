

import java.util.Map.Entry;
import java.util.*;
 
//import org.w3c.dom.css.Counter;
 
public class Main {
//public class App {
 
    public static void main(final String[] args){
     //スキャン
     final Scanner s = new Scanner(System.in);
      int N = Integer.parseInt(s.next());
      int K = Integer.parseInt(s.next());
      ArrayList<Long> A = new ArrayList<Long>();
      for(long i=0;i<N;i++){
            A.add(s.nextLong());
      }
      int counter = N-K;
      int now = 0;
      long bef =1;
      long aft =1;
      while(counter > now){
          if(now ==0){
            for(int i=0;i<K;i++){
                bef *= A.get(i+now);
                aft *= A.get(i+now+1);
            }
          }else{
            bef /=A.get(now-1);
            bef *=A.get(now+K-1);
            aft /=A.get(now);
            aft *=A.get(now+K);
          }
        now ++;
        if(bef<aft){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
      }
    }
}