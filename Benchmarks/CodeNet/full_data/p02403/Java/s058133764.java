import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int H, W = 0;
        while(true) {
            H = sc.nextInt();
            W = sc.nextInt();
            if(H==0&&W==0) break;
            for(int i=0; i<H; i++) {
                for(int j=0; j<W; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        
    }
}

