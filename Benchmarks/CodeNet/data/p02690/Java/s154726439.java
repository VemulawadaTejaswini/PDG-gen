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
        long X = sc.nextLong();
        for(int a = -100;a<=100;a++){
            for(int b=-100;b<=100;b++){
                if(a*a*a*a*a - b*b*b*b*b == X){
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
