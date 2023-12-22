import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        for(;;){
            String w = sc.next();
            if(w.equals("-")) break;
            int m = sc.nextInt();
            for(int i = 0; i < m; i++) {
                int h = sc.nextInt();
                w = w.substring(h) + w.substring(0, h);
            }
            System.out.println(w);
        }
    }
}