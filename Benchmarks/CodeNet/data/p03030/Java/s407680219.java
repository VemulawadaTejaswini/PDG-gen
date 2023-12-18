import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);
        Integer N = Integer.parseInt(sc.nextLine());

        String[] S = new String[N];
        Map<String, Integer> origin = new HashMap<>();
        Map<String, List<Integer>> scores = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] sp = sc.nextLine().split(" ");
            S[i] = sp[0];

            List<Integer> points = scores.get(sp[0]);
            if (points == null) {
                points = new ArrayList<>();
            }
            points.add(Integer.parseInt(sp[1]));
            points.sort(Comparator.reverseOrder());
            scores.put(sp[0], points);

            origin.put(sp[0] + sp[1], i + 1);
        }

        Arrays.sort(S);
        String[] sorted = new String[N];
        String tmp = "";
        int index = 0;
        for (int i = 0; i < N; i++) {
            String store = S[i];
            List<Integer> list = scores.get(store);

            int point = 0;
            if (tmp.equals("")) {
                point = list.get(0);
            } else if (tmp.equals(store)) {
                index++;
                point = list.get(index);
            } else {
                index = 0;
                point = list.get(index);
            }

            tmp = store;

            sorted[i] = store + point;
        }

        for (String sp : sorted) {
            System.out.println(origin.get(sp));
        }
    }
}
