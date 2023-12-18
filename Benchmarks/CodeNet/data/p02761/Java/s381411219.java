import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int[] num = new int[n];
        boolean[] found = new boolean[n];
        //int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i ++){
            int a = scan.nextInt(), b = scan.nextInt();
            if (found[a - 1]){
                if (num[a - 1] != b){
                    System.out.println("-1");
                    return;
                }
            }
            else{
                found[a - 1] = true;
                num[a - 1] = b;
            }
        }
        if (num[0] == 0 && n != 1)
            System.out.println("-1");
        else{
            for (int i : num)
                System.out.print(i);
        }

    }
}
