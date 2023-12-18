import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        List<String> list = new ArrayList<String>(N);
        for (int i = 0; i < N; i++) {
            char[] s = sc.next().toCharArray();
            Arrays.sort(s);
            list.add(String.valueOf(s));
        }
        sc.close();

        long count = 0;
        for (int i = 0; i < N - 1; i++) {
            String S = list.get(i);
            for (int j = i + 1; j < N; j++) {
                if (S.equals(list.get(j))) {
                    count ++;
                }
            }
        }
        out.printf("%d\n", count);
        out.flush();
    }
}
