import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long X = Long.parseLong(in.readLine());
        long base = 100;
        int ans = 0;
        while(base < X) {
            base = base + (base / 100);
            ++ans;
        }
        System.out.println(ans);
    }
}