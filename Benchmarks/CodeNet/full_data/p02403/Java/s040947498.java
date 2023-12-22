import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if(h == 0 && w == 0) break;
            String s = "";
            for(int i = 0; i < w; i++) {
                s += "#";
            }
            for(int i = 0; i < h; i++) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}