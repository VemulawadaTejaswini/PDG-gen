import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] split = in.readLine().split(" ");
        int A = Integer.parseInt(split[0]);
        long B = Long.parseLong(split[1]);
        long N = Long.parseLong(split[2]);
        long X = -1;
        if(N < B) {
            X = N;
        } else {
            X = B - 1;
        }
        System.out.println((long)(Math.floor((A * X) / B) - A * Math.floor(X / B)));
    }
}