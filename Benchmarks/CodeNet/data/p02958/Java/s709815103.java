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
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> copy = new ArrayList<Integer>(list);

        Collections.sort(copy, Comparator.naturalOrder());

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (list.get(i) != copy.get(i))
                cnt++;
        }

        if (cnt == 0 || cnt == 2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}