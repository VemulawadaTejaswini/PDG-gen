import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Collections;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();

        long x = N;

        System.out.println(x % K);
    }

}
