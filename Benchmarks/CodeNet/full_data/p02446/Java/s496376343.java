import java.util.*;
// import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int tmp = sc.nextInt();
            array.add(tmp);
        }

        TreeSet<Integer> tmp = new TreeSet<>();

        for (int i = 0; i < num; i++) {
            tmp.add(array.get(i));
        }

        while (!tmp.isEmpty()) {
            sb.append(tmp.pollFirst());
            if (!tmp.isEmpty()) sb.append(' ');
        }

        /* for (int i = 0; i < array.size(); i++) {
            sb.append(array.get(i));
            if (i != array.size() - 1) sb.append(' ');
        } */

        System.out.println(sb);
        
        sc.close();
    }
}

