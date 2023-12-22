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
            String t = "";
            for(int i = 0; i < w; i++) {
                s += ((i%2) == 0) ? "#" : ".";
                t += ((i%2) == 1) ? "#" : ".";
            }
            for(int i = 0; i < h; i++) {
                System.out.println((i % 2) == 0 ? s : t);
            }
            System.out.println();
        }
    }
}