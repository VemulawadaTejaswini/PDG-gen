import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int h, w;
        while((h = scn.nextInt()) != 0 | (w = scn.nextInt()) != 0) {
            rect(h, w);
            System.out.println();
        }
    }
    
    private static void rect(int h, int w) {
        for(int i = 0; i++ < h; System.out.println()) {
            for(int j = 0; j++ < w; System.out.print("#"));
        }
    }
}