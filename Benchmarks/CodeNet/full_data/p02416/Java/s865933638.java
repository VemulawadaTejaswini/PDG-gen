import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            char [] cs = sc.nextLine().toCharArray();
            if(n == 0) break;
            int s = 0;
            for(int i = 0; i < sc.length; i++) {
                s += cs[i] - '0';
            }
            System.out.println(s);
        }
    }
}