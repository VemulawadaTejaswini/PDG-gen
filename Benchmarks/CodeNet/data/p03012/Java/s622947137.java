import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Model m = input(System.in);
        int result = proc(m);
        System.out.println(result);
    }

    static class Model {
        int N;
        List<Integer> list = new ArrayList<Integer>();
    }

    static Model input(InputStream in) {
        Model m = new Model();
        try (Scanner sc = new Scanner(in)) {
            String[] line1 = sc.nextLine().split("");
            String[] line2 = sc.nextLine().split(" ");

            m.N = Integer.parseInt(line1[0]);
            for (String str : line2) {
                m.list.add(Integer.parseInt(str));
            }
        }
        return m;
    }

    static int proc(final Model m) {
        int abs = 10000;

        for (int i = 0; i < m.N; i++) {
            List<Integer> listS1 = m.list.subList(0, i + 1);
            List<Integer> listS2 = m.list.subList(i + 1, m.list.size());

            int S1 = sumAll(listS1);
            int S2 = sumAll(listS2);

            abs = Math.min(abs, Math.abs(S1 - S2));
        }
        return abs;
    }

    static int sumAll(final List<Integer> list) {
        int result = 0;

        for (Integer num : list) {
            result += num;
        }
        return result;
    }
}
