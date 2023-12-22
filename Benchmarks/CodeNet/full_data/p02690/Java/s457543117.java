import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        BigInteger X = BigInteger.valueOf(x);
        for(int a = -1000;a<=1000;a++){
            for(int b=-1000;b<=1000;b++){
                BigInteger A = BigInteger.valueOf(a);
                A = A.pow(5);
                BigInteger B = BigInteger.valueOf(b);
                B = B.pow(5);
                if(A.subtract(B).equals(X)){
                    System.out.println(a+" "+b);
                    return;
                }
            }
        }
        throw new Error();
    }

    public static void main(String[] args) {
        new Main();
    }
}
