import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {



    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        long A = Long.parseLong(s[0]);
        long B = Long.parseLong(s[1]);
        long C = Long.parseLong(s[2]);
        long K = Long.parseLong(s[3]);
        long ans = 0;
        if(A > K) {
            System.out.println(K);
        } else {
            K -= A;
        }
        if(K == 0) {
            System.out.println(A);
        } else {
            if(B > K) {
                System.out.println(A);
            } else {
                K -= B;
            }
            if(K == 0) {
                System.out.println(A);
            } else {
                if(C > K) {
                    System.out.println(A - K);
                } else {
                    System.out.println(A - C);
                }
            }
        }

    }

}
