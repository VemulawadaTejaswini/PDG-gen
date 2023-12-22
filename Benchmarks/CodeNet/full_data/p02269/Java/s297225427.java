import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer order_num = Integer.parseInt(s.next());
        HashSet<String> hs = new HashSet<String>();

        for(int i=0; i < order_num; ++i) {
            String order = s.next();
            String str = s.next();
            if(order.equals("insert")) {
                hs.add(str);
            }

            else if(order.equals("find")) {
                if(hs.contains(str)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
        s.close();
    }
}
