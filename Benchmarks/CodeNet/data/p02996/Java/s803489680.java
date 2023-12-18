import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

public class Main {

    static final int modnum = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<AbstractMap.SimpleEntry<Integer, Integer>> list = new ArrayList<AbstractMap.SimpleEntry<Integer, Integer>>();
        for (int i = 0; i < N; i++) {
            int work = sc.nextInt();
            int limit = sc.nextInt();
            list.add(new AbstractMap.SimpleEntry<Integer, Integer>(limit, work));
        }
        Collections.sort(list, Comparator.comparing(AbstractMap.SimpleEntry<Integer, Integer>::getKey));
        long time = 0;
        for (int i = 0; i < N; i++) {
            AbstractMap.SimpleEntry<Integer, Integer> working = list.get(i);
            if (time + working.getValue() <= working.getKey()) {

                // System.out.println(time + "   " + working.getKey() + "   " + working.getValue() + "   "
                //         + (working.getKey() + working.getValue()));
                time += working.getValue();
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        // long time = list.get(list.size() - 1).getKey() + list.get(list.size() -
        // 1).getValue();
        // while (!list.isEmpty()) {
        // int i;

        // for (i = list.size() - 1; i >= 0; i--) {
        // AbstractMap.SimpleEntry<Integer, Integer> working = list.get(i);
        // if (working.getKey() + working.getValue() <= time) {

        // System.out.println(time + " " + working.getKey() + " " + working.getValue() +
        // " "
        // + (working.getKey() + working.getValue()));
        // time -= working.getValue();
        // list.remove(i);
        // break;
        // }
        // }
        // if (i < 0) {
        // System.out.println("aaa");

        // AbstractMap.SimpleEntry<Integer, Integer> working = list.get(list.size() -
        // 1);
        // time = working.getKey() + working.getValue();
        // }
        // }

        // if (time < 0) {
        // System.out.println("No");
        // } else {
        // System.out.println("Yes");
        // }
    }
}