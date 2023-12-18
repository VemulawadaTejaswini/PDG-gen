

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int trees = sc.nextInt();
        int inspector = sc.nextInt();
        int a = 2*inspector + 1;
        double ans = Math.ceil(trees / a);
        System.out.print(ans);
    }
}