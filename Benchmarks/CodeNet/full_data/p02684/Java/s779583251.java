import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;


public class Main {
    public static void main(final String[] args){
        final Scanner s = new Scanner(System.in);
        final int N = Integer.parseInt(s.next());
        String hoge3 = s.next();
        final BigInteger  K = new BigInteger(hoge3);
        //final HashSet<Integer> bookInfo= new HashSet<Integer>();
        final HashMap<Integer,Integer> cityNumTel= new HashMap<Integer,Integer>();
       for(int i = 1;i<=N;i++){
            cityNumTel.put(i,  Integer.parseInt(s.next()));
       }
       int point = 1;
      
      String input1  = "1"; 
      final BigInteger b 
            = new BigInteger(input1); 
    
      for(BigInteger i= BigInteger.valueOf(0);
          i.compareTo(K) == -1;
          i= i.add(b)
          ){
           point = cityNumTel.get(point);
       }
      System.out.println(point);
    }
}