import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        while (H != 0 || W != 0) {
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    System.out.printf("#");
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
            
            H = sc.nextInt();
            W = sc.nextInt();
        }
    }
}