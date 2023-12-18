import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;

public class Main {
//public class App {

    public static void main(final String[] args){
     //スキャン
     final Scanner s = new Scanner(System.in);
     final Map<Integer, String> map = new HashMap<Integer, String>();
     int counter = 0;
     final int ugeuge= Integer.parseInt(s.next());
    
    for(int i=0;i < ugeuge ; i++){
        //Scanner hoge = new Scanner(System.in);
        final String tareget = s.next();

        if(map.containsValue(tareget)){
    
        }else{
            counter ++;
            map.put(i, tareget);
        }
        
    }
            System.out.println(counter);
       
    }
}
