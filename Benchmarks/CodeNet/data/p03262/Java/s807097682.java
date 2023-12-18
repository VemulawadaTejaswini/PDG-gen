

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by thompson on 08/09/2018.
 */
public class Main {
    static int N, X;
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        X = sc.nextInt();

        for (int i = 0; i < N; i++) {
            numbers.add(sc.nextInt());
        }


        numbers.add(X);
        Collections.sort(numbers);

        List<Integer> list = new ArrayList<>();
        fillList(list);
        Collections.sort(list);

        //find
        int max = list.get(0);
        boolean firstTime = true;
        boolean find = false;

        for (; max >= 1; ) {
            for (int i = 0; i < list.size(); i++) {
                int number = list.get(i);
                if (number % max != 0)
                    break;

                if (i == list.size() - 1)
                    find = true;
            }

            if (find)
                break;

            if (firstTime) {
                firstTime = false;
                max = max / 2;
                continue;
            }

            max--;
        }

        System.out.println(max);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 1; i < numbers.size(); i++) {
            list.add(numbers.get(i) - numbers.get(i - 1));
        }
    }
}
