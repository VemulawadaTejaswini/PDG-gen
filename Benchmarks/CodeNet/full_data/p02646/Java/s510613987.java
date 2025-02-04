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
        long ans = 0;
        long A = sc.nextLong();
        long V = sc.nextLong();
        long B = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();
        long a = 0;
        long b = Math.max(A,B)-Math.min(A,B);
        if(V*T>=b+W*T){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
