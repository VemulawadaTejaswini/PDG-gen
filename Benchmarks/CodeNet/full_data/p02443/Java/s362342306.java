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

        int num_query = sc.nextInt();

        for (int i = 0; i < num_query; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            List<Integer> sub = array.subList(l, r);
            Collections.reverse(sub);

            for (int j = l; j < r; j++) {
                array.set(j, sub.get(j - l));
            }
        }

        for (int i = 0; i < array.size(); i++) {
            sb.append(array.get(i));
            if (i != array.size() - 1) sb.append(' ');
        }

        System.out.println(sb);
        
        sc.close();
    }
}

