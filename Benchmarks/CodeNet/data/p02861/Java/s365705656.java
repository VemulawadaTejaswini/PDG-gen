import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] ary = new int[n][2];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ary[i][0] = Integer.parseInt(sc.next());
            ary[i][1] = Integer.parseInt(sc.next());
            list.add(i);
        }
        List<List<Integer>> makeList = makePermutation(list);
        double sum = 0;
        for (int i = 0; i < makeList.size(); i++) {
            List<Integer> list2 = makeList.get(i);
            for (int j = 0; j < n - 1; j++) {
                sum += Math.sqrt(Math.pow(ary[list2.get(j)][0] - ary[list2.get(j + 1)][0], 2) + Math.pow(ary[list2.get(j)][1] - ary[list2.get(j + 1)][1], 2));
            }
        }
        System.out.println(sum / factorial(n));
    }

    public static List<List<Integer>> makePermutation(List<Integer> list) {
        if (list.size() == 0) {
            List<List<Integer>> empty = new ArrayList<>();
            empty.add(new ArrayList<>());
            return empty;
        }

        return list.stream().flatMap(i -> {
            List<Integer> rest = new ArrayList<>(list);
            rest.remove(i);
            return makePermutation(rest).stream().map(lst -> {
                lst.add(0, i);
                return lst;
            });
        }).collect(Collectors.toList());
    }

    private static long factorial(long n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}