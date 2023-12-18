import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    /**
     * 本処理を実行します。
     */
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        int n = nextInt(sc);

        Integer[] ai = nextInts(sc, n);

        Category top = new Category(ai);
        Category center = new Category(sc, n, top);
        Category bottom = new Category(sc, n, center);

        // 下段に使えるものが無い時は0個
        if (center.parts.size() == 0 || bottom.parts.size() == 0) {
            out(0);
            return;
        }

        long count = 0;
        for (Integer top_i : top.parts) {

            // 使える中段を取る
            List<Integer> validCenter = center.parts.parallelStream().filter(ci -> top_i < ci).collect(Collectors.toList());

            for (Integer center_i : validCenter) {
                count += bottom.parts.parallelStream().filter(bi -> center_i < bi).count();
            }
        }

        out(count);

        /*top.parts.parallelStream().forEach(top_i -> {

            // 使える中段を取る
            List<Integer> validCenter = center.parts.parallelStream().filter(ci -> top_i < ci).collect(Collectors.toList());

            validCenter.parallelStream().forEach(center_i -> {

            });
        });*/


    }

    public static class Category {
        /** パーツ */
        List<Integer> parts;

        /** 最大のパーツ */
        int max;

        /** 最小のパーツ */
        int min;

        public Category(Integer[] parts) {
            super();
            this.parts = Arrays.asList(parts);

            // 最大・最小
            Collections.sort(this.parts);
            this.min = this.parts.get(0);
            this.max = this.parts.get(this.parts.size() - 1);
        }

        public Category(Scanner sc, int n, Category parentCat) {
            super();
            List<Integer> parts = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int in = nextInt(sc);

                if (in > parentCat.min) {
                    parts.add(in);
                }
            }

            this.parts = parts;

            // 最大・最小
            if (this.parts.size() == 0) {
                this.min = 0;
                this.max = 0;
            } else {
                Collections.sort(this.parts);
                this.min = this.parts.get(0);
                this.max = this.parts.get(this.parts.size() - 1);
            }
        }

    }

    /**
     * 次の標準入力をintで受け取ります。
     * @return 標準入力値(int)
     */
    public static int nextInt(Scanner sc) {
        return sc.nextInt();
    }

    /**
     * 次の標準入力をStringで受け取ります。
     * @return 標準入力値(String)
     */
    public static String nextString(Scanner sc) {
        return sc.next();
    }

    /**
     * 次の標準入力を指定回数分intで受け取ります。
     * @param n 取得回数
     * @return 取得した標準入力値の配列(int)
     */
    public static Integer[] nextInts(Scanner sc, int n) {
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nextInt(sc);
        }

        return arr;
    }

    /**
     * 標準出力にオブジェクトを出力します。
     * @param o 出力対象
     */
    public static void out(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        execute();
    }

    public static void putCountMap(Map<Integer, Integer> map, int value) {
        if (map.containsKey(value)) {
            map.put(value, map.get(value) + 1);
        } else {
            map.put(value, 1);
        }
    }
}