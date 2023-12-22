import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int h, w;
        while((h = scn.nextInt()) != 0 | (w = scn.nextInt()) != 0) {
            frame(h, w);
            System.out.println();
        }
    }
    
    private static void frame(int h, int w) {
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(i == 0 || j == 0 || i == ~-h || j == ~-w) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}