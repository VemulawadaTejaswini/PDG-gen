
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final List<Integer> colors = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            final int next = scanner.nextInt();
            insert(colors, next);
        }

        System.out.println(colors.size());
    }

    private static void insert(final List<Integer> list, final int value) {
        if(list.isEmpty()){
            list.add(value);
            return;
        }

        if (value <= list.get(0)) {
            list.add(0, value);
            return;
        }

        if(value > list.get(list.size() - 1)){
            list.set(list.size() -1,value);
            return;
        }

        final int index = mySearch(list, value, 0, list.size() - 1);
        list.set(index, value);
    }

    private static int mySearch(final List<Integer> list, final int value, final int start, final int end) {
        if(end - start <=1){
            return start;
        }

        final int means = (start + end) / 2;
        if (value <= list.get(means)) {
            return mySearch(list, value, start, means);
        } else {
            return mySearch(list, value, means + 1, end);
        }
    }
}
