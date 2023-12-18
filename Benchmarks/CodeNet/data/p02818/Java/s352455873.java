import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        long ret = k-a;
        a = Math.max(0,a-k);
        b -= Math.max(0,ret);
        System.out.println(a + " " + b);
    }
}

