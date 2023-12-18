import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int[] num = new int[n];
        boolean[] found = new boolean[n];
        for (int i = 0; i < m; i ++){
            int a = scan.nextInt(), b = scan.nextInt();
            if (found[a - 1])
                num[a - 1] = Math.min(num[a - 1], b);
            else{
                found[a - 1] = true;
                num[a - 1] = b;
            }
        }
        if (num[0] == 0)
            System.out.println("-1");
        else{
            for (int i : num)
                System.out.print(i);
        }

    }
}
