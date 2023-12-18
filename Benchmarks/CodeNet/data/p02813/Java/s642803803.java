import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = 0;
        String Pstr = "";
        for (int i = 0; i < N; i++) {
            Pstr += sc.next();
        }
        P = Integer.parseInt(Pstr);
        int Q = 0;
        String Qstr = "";
        for (int i = 0; i < N; i++) {
            Qstr += sc.next();
        }
        Q = Integer.parseInt(Qstr);
        int a = 0;
        int b = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (N != 0) {
            list.add(N);
            N -= 1;
        }
        List<List<Integer>> T = make(list);
        Collections.reverse(T);
        for (int i = 0; i < T.size(); i++) {
            String tmp = "";
            for (int k = 0; k < list.size(); k++) {
                tmp += T.get(i).get(k);

            }
            int tmpi = Integer.parseInt(tmp);
            if (P == tmpi) {
                a = i + 1;
            } else if (Q == tmpi) {
                b = i + 1;
            }
        }
        System.out.println(Math.abs(a - b));
    }

    public static List<List<Integer>> make(List<Integer> candidate) {
        if (candidate.size() == 0) {
            List<List<Integer>> empty = new ArrayList<>();
            empty.add(new ArrayList<>());
            return empty;
        }
        return candidate.stream().flatMap(i -> {
            List<Integer> rest = new ArrayList<>(candidate);
            rest.remove(i);
            return make(rest).stream().map(list -> {
                list.add(0, i);
                return list;
            });
        }).collect(Collectors.toList());
    }
}
