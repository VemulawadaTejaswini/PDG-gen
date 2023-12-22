
import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;

public class Main {
//public class App {

    public static void main(String[] args){
     //スキャン
     Scanner s = new Scanner(System.in);
       // 入力
       int AP = Integer.parseInt(s.next());
       int AH =Integer.parseInt(s.next());
       int BP = Integer.parseInt(s.next());
       int BH =Integer.parseInt(s.next());

       int AL = AH / BP;
       int BL = BH/ AP;

        if(BL <= AL){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}



