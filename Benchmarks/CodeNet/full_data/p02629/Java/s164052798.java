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
        long ans = 0;
        BigInteger num = new BigInteger(sc.next());
        num = num.subtract(BigInteger.ONE);
        StringBuilder sb = new StringBuilder();
        // if(num.compareTo(BigInteger.valueOf(INF))<0){            
        //     BigInteger[] div = num.divideAndRemainder(BigInteger.valueOf(ALF));
        //     sb.append((char)('a' + div[1].intValue()));
        //     num = div[0];
        // }

        while(num.compareTo(BigInteger.ZERO)>=0){
            BigInteger[] div = num.divideAndRemainder(BigInteger.valueOf(ALF));
            sb.append((char)('a' + div[1].intValue()/*-1*/));
            num = div[0].subtract(BigInteger.ONE);
        }
        sb.reverse();

        System.out.println(sb);
    }

    public static void main(String[] args) {
        new Main();
    }
}
