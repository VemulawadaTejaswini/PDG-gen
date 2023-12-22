import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;


public class Main {
    public static void main(final String[] args){
        final Scanner s = new Scanner(System.in);
        String one = s.next();
        String two = s.next();
        String twoOne =two.substring(0,two.length() -1);
        if(one.equals(twoOne)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}