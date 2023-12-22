import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int h, w;
        h = input.nextInt();
        w = input.nextInt();
        while (input.hasNextInt()) {                        
            for (int i = 0; i < h; ++i) {
                for (int k = 0; k < w; ++k) {
                    System.out.print("#");
                }
                System.out.println("");
            }
            h = input.nextInt();
            w = input.nextInt();
            System.out.println("");            
        }
    }   
}