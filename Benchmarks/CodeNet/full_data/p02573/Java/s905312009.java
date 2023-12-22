import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int M = sc.nextInt();

        int[][] info = new int[M][2];

        for (int i = 0; i < M; i++) {
            info[i][0] = sc.nextInt();
            info[i][1] = sc.nextInt();
        }

        HashMap<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < M; i++) {

            Set<Integer> set = map.getOrDefault(info[i][0], new HashSet<>());
            set.add(info[i][1]);
            map.put(info[i][0], set);

            Set<Integer> set2 = map.getOrDefault(info[i][1], new HashSet<>());
            set2.add(info[i][0]);
            map.put(info[i][1], set2);
        }

        int size = 0;
        for (int key : map.keySet()) {

            if (map.get(key).size() > size) {
                size = map.get(key).size();
            }
        }
        System.out.println(size + 1);
    }
}