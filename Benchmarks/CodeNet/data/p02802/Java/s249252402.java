import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Predicate;
import java.math.BigInteger;
import java.rmi.MarshalException;
import java.time.Instant;
import java.time.Duration;
import java.util.concurrent.*;

public class Main {
    static String lastcard(String a, String b) {
        int k = a.length();
        String ret = "";
        for (int i = 0; i < k; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                ret += a.charAt(i);
            } else {
                if (a.charAt(i) == 'S' && b.charAt(i) == 'E' || a.charAt(i) == 'E' && b.charAt(i) == 'S') {
                    ret += 'T';
                }
                else if (a.charAt(i) == 'S' && b.charAt(i) == 'T' || a.charAt(i) == 'T' && b.charAt(i) == 'S') {
                    ret += 'E';
                }
                else if (a.charAt(i) == 'E' && b.charAt(i) == 'T' || a.charAt(i) == 'T' && b.charAt(i) == 'E') {
                    ret += 'S';
                }
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // long startTime = System.nanoTime();
        // int  = sc.next();
        // int  = sc.nextInt();
        /////////////////////////////////////////////////////
        int probs = sc.nextInt();
        int subs = sc.nextInt();
        boolean[] ac = new boolean[probs + 1];
        int[] pentrack = new int[probs + 1];
        int correct = 0;
        int penalty = 0;
        
        for (int i = 0; i < subs; i++) {
            int id = sc.nextInt();
            String s = sc.next();
            if (s.equals("WA") && ac[id] == false) {
                ++pentrack[id];
            } else if (s.equals("AC") && ac[id] == false) {
                ac[id] = true;
                ++correct;
            }
        }

        for (int i = 0; i < pentrack.length; ++i) {
            if (ac[i]) {
                penalty += pentrack[i];
            }
        }
        System.out.println(correct + " " + penalty);
        /////////////////////////////////////////////////////
        // long endTime = System.nanoTime();
        // System.out.printf("Executed in: %.2fms\n", ((double)endTime - startTime) / 1000000);
        // sc.close();
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static boolean isOdd(int n) {
        return n % 2 == 1;
    }
     
    static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

class Pair {
    public int x;
    public int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        // System.out.println("inside equals");
        if (o == this) {
            return true;
        } else if (!(o instanceof Pair)) {
            return false;
        } else {
            Pair p = (Pair)o;
            return this.x == p.x && this.y == p.y;
        }
    }

    @Override
    public int hashCode() {
        // System.out.println("inside hashcode");
        return Arrays.hashCode(new int[]{this.x, this.y});
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}