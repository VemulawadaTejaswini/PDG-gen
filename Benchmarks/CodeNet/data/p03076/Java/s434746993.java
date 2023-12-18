// package abc123.B;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] times = new int[5];
        for (int i = 0; i < 5; i += 1) {
            times[i] = sc.nextInt();
        }

        Integer[] indices = new Integer[5];
        for (int i = 0; i < 5; i += 1) {
            indices[i] = i;
        }
        List<List<Integer>> perms = permute(indices);

        int minTime = Integer.MAX_VALUE;
        for (List<Integer> perm : perms) {
            int time = 0;
            for (int index : perm) {
                if (time % 10 != 0) {
                    time += 10 - (time % 10);
                }
                time += times[index];
            }
            if (minTime > time) {
                minTime = time;
            }
        }

        System.out.println(minTime);
    }

    private static <T> List<List<T>> permute(T[] items) {
        List<List<T>> perms = new LinkedList<>();
        permuteHelper(perms, items, 0);
        return perms;
    }

    private static <T> void permuteHelper(List<List<T>> perms, T[] items, int n) {
        if (n == items.length - 1) {
            List<T> perm = new LinkedList<>();
            for (T item : items) {
                perm.add(item);
            }
            perms.add(perm);
        } else {
            for (int m = n; m < items.length; m += 1) {
                swap(items, n, m);
                permuteHelper(perms, items, n + 1);
                swap(items, n, m);
            }
        }
    }

    private static <T> void swap(T[] items, int index1, int index2) {
        T tmp = items[index1];
        items[index1] = items[index2];
        items[index2] = tmp;
    }

}
