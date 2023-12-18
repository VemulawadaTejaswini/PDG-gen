import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

class Main {

    static final int modnum = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> city = new ArrayList<Integer>();
        ArrayList<Integer> hunter = new ArrayList<Integer>();
        for (int i = 0; i <= N; i++) {
            city.add(sc.nextInt());
        }
        for (int i = 0; i < N; i++) {
            hunter.add(sc.nextInt());
        }

        long cnt = 0;
        for (int i = 0; i < N; i++) {
            int cap = hunter.get(i);
            int tag1 = city.get(i);
            int tag2 = city.get(i + 1);

            if (tag1 < cap) {
                cap -= tag1;
                cnt += tag1;
                tag1 = 0;
            } else {
                tag1 -= cap;
                cnt += cap;
                cap = 0;
            }

            if (tag2 < cap) {
                cap -= tag2;
                cnt += tag2;
                tag2 = 0;
            } else {
                tag2 -= cap;
                cnt += cap;
                cap = 0;
            }

            city.set(i, tag1);
            city.set(i + 1, tag2);
        }

        System.out.println(city.toString());
        System.out.println(hunter.toString());
        System.out.println(cnt);
    }
}