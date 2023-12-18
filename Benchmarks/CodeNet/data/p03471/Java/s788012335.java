import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        
        int a = 10000, b = 5000, c = 1000;

        for(int x = 0; x <= n; x++) {
            for(int y = 0; y <= n; y++) {
                int rest = s - x * a + y * b;
                if(rest < 0 || rest % 1000 != 0 || (x + y + rest / 1000 != n)) continue;
                else {
                    System.out.println(x + " " + y + " " + (rest / 1000));
                    return;
                }

            }
        }

        System.out.println("-1 -1 -1");
    }
}