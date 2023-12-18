import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        final int[] list = {0,1,3,1,2,1,2,1,1,2,1,2,1};
        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        if(list[x] == list[y]) {
            out.println("Yes");
        } else {
            out.println("No");
        }
        
        
        sc.close();
    }
}