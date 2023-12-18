

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] c = new int[n + 1];
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        int aMin = n;
        int bMax = 0;

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            aList.add(a);
            bList.add(b);
            if (aMin > a) {
                aMin = a;
            }
            if (bMax < b) {
                bMax = b;
            }
            for (int j = a; j <= b; j++) {
                c[j]++;
            }
        }

        int answer = 0;
        while (aList.size() > 0) {
            answer++;
            //get max
            List<Integer> list = new ArrayList<>();
            int max = 0;
            int index = 0;
            for (int i = aMin; i <= bMax; i++) {
                if (max < c[i]) {
                    max = c[i];
                    index = i;
                }
                list.add(c[i]);
            }
            c[index] = 0;
            //済んだやつは消してく
            List<Integer> aList2 = new ArrayList<>();
            List<Integer> bList2 = new ArrayList<>();
            aMin = n;
            bMax = 0;
            for (int i = 0; i < aList.size(); i++) {
                if (aList.get(i) <= index && bList.get(i) > index) {
                    continue;
                }
                aList2.add(aList.get(i));
                if (aMin > aList.get(i)) {
                    aMin = aList.get(i);
                }
                bList2.add(bList.get(i));
                if (bMax < bList.get(i)) {
                    bMax = bList.get(i);
                }
            }
            aList = aList2;
            bList = bList2;
        }
        System.out.println(answer);
    }
}
