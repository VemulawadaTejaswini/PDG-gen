

import java.util.*;

public class Main {
    public static class Tuple<T> {
        public T left, right;
        public Tuple(T l, T r) {
            this.left = l;
            this.right = r;
        }
        public static <T> Tuple<T> of(T l, T r) {
            return new Tuple<>(l, r);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Tuple<?> tuple = (Tuple<?>) o;
            return Objects.equals(left, tuple.left) &&
                    Objects.equals(right, tuple.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(left, right);
        }
    }

    public static void run(int H, int W, char S[][]) {
        int m[][] = new int[H][W];
        for (int i = 0; i < m.length; i++) {
            Arrays.fill(m[i], Integer.MAX_VALUE);
        }

        Queue<Tuple<Integer>> Q = new PriorityQueue<>(Comparator.comparingInt(t -> m[t.left][t.right]));
        Q.add(Tuple.of(0, 0));
        m[0][0] = 1;

        while(!Q.isEmpty()) {
            Tuple<Integer> x = Q.poll();

            int v = m[x.left][x.right];
            for (int i = Math.max(0, x.left - 1); i < Math.min(x.left + 2, H); i++) {
                for (int j = Math.max(0, x.right - 1); j < Math.min(x.right + 2, W); j++) {
                    if (i != x.left && j != x.right) {
                        continue;
                    }
                    if (S[i][j] == '#') {
                        continue;
                    }
                    if (v + 1 < m[i][j]) {
                        m[i][j] = v + 1;
                        Tuple<Integer> np = Tuple.of(i, j);
                        Q.remove(np);
                        Q.add(np);
                    }
                }
            }
        }

        int wall = 0;
        for (char[] l : S) {
            for (char c : l) {
                if (c == '#') {
                    wall++;
                }
            }
        }
        System.out.println(W * H - wall - m[H - 1][W - 1]);
    }

    public static void runInput() {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        char S[][] = new char[H][W];

        scanner.nextLine();
        for (int i = 0; i < H; i++) {
            S[i] = scanner.nextLine().toCharArray();
        }

        run(H, W, S);
    }

    public static void main(String args[]) {
        runInput();
        /*
        run(10, 37, new char[][] {
".....................................".toCharArray(),
"...#...####...####..###...###...###..".toCharArray(),
"..#.#..#...#.##....#...#.#...#.#...#.".toCharArray(),
"..#.#..#...#.#.....#...#.#...#.#...#.".toCharArray(),
".#...#.#..##.#.....#...#.#.###.#.###.".toCharArray(),
".#####.####..#.....#...#..##....##...".toCharArray(),
".#...#.#...#.#.....#...#.#...#.#...#.".toCharArray(),
".#...#.#...#.##....#...#.#...#.#...#.".toCharArray(),
".#...#.####...####..###...###...###..".toCharArray(),
".....................................".toCharArray()
        });
        */
    }
}
