
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Dish> list = new ArrayList<Dish>(N);
        for (int i = 0; i < N; i++) {
            list.add(new Dish(sc.nextInt(), sc.nextInt()));
        }
        list.sort((a, b) -> {
            return b.sum - a.sum;
        });
        long ans = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                ans += list.get(i).a;
            } else {
                ans -= list.get(i).b;
            }
        }
        System.out.println(ans);
    }
}

class Dish {
    int a;
    int b;
    int sum;

    Dish(int a, int b) {
        this.a = a;
        this.b = b;
        sum = a + b;
    }
}