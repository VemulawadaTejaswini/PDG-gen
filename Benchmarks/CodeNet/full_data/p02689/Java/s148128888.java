import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;


public class Main {
    public static void main(final String[] args){
        final Scanner s = new Scanner(System.in);
        final int N = Integer.parseInt(s.next());
        final int M = Integer.parseInt(s.next());
        HashSet<Integer> peak = new HashSet<Integer>();
        //HashMap<Integer,Integer> connect = new HashMap<Integer,Integer>();
        HashSet<Integer> outList = new HashSet<Integer>();
        
        for(int i=0; i<N ;i++){
           peak.add(Integer.parseInt(s.next()));
        }
        
        for(int i=0; i<M-1 ;i += 2){
            int hoge = Math.min(Integer.parseInt(s.next()),Integer.parseInt(s.next()));
            if(!outList.contains(hoge)){
                outList.add(hoge);
            }
         }

         System.out.println(N-outList.size());;
   

    }
}