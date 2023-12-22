import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int h, w;        
        while (input.hasNextInt()) {
            h = input.nextInt();
            w = input.nextInt();
            if (h == 0 && w == 0) break;
            for (int i = 0; i < h; ++i) {
                for (int k = 0; k < w; ++k) {
                    System.out.println("#");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }         
}