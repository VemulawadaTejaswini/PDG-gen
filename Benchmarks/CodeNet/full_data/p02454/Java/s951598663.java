import java.util.*;
// import java.io.*;
// import java.time.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int num = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            array.add(sc.nextInt());
        }

        int query = sc.nextInt();

        for (int i = 0; i < query; i++) {
            int key = sc.nextInt();
            int lower_bound = LowerBound(array, key);
            if (lower_bound < 0) sb.append(num).append(" ");
            else sb.append(lower_bound).append(" ");
            int upper_bound = UpperBound(array, key);
            if (upper_bound < 0) sb.append(num).append("\n");
            else sb.append(upper_bound).append("\n");
        }

        System.out.print(sb);
        
        sc.close();
    }

    public static int LowerBound(List<Integer> list, int key) {
        int lower = -1;
        int middle = -1;
        int upper = list.size();

        while (upper > lower + 1) {
            middle = lower + (upper - lower) / 2;
            if (list.get(middle) > key - 1) upper = middle;
            else lower = middle;
        }

        return upper;
    }

    public static int UpperBound(List<Integer> list, int key) {
        int lower = -1;
        int middle = -1;
        int upper = list.size();

        while (upper > lower + 1) {
            middle = lower + (upper - lower) / 2;
            if (list.get(middle) > key) upper = middle;
            else lower = middle;
        }

        return upper;
    }
}

