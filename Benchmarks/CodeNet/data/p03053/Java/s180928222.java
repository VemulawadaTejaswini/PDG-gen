import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();

        boolean A[][] = new boolean[H][W];
        Set<Pos> posSet = new HashSet<>();
        int numOfBlack = 0;

        for (int i = 0; i < H; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < W; j++) {
                boolean b = (line.charAt(j) == '#');
                A[i][j] = b;
                if (b) {
                    numOfBlack++;
                    posSet.add(new Pos(i, j));
                }
            }
        }

        int SIZE = H * W;
        int count = 0;
        while(numOfBlack < SIZE) {
            count++;
            Set<Pos> nextPosSet = new HashSet<>();

            Iterator<Pos> iterator = posSet.iterator();
            while(iterator.hasNext()) {
                Pos next = iterator.next();
                if (next.i > 0 && !A[next.i - 1][next.j]) {
                    nextPosSet.add(new Pos(next.i - 1, next.j));
                    A[next.i - 1][next.j] = true;
                    numOfBlack++;
                }
                if (next.j > 0 && !A[next.i][next.j - 1]) {
                    nextPosSet.add(new Pos(next.i, next.j - 1));
                    A[next.i][next.j - 1] = true;
                    numOfBlack++;
                }
                if (next.i < H - 1 && !A[next.i + 1][next.j]) {
                    nextPosSet.add(new Pos(next.i + 1, next.j));
                    A[next.i + 1][next.j] = true;
                    numOfBlack++;
                }
                if (next.j < W - 1 && !A[next.i][next.j + 1]) {
                    nextPosSet.add(new Pos(next.i, next.j + 1));
                    A[next.i][next.j + 1] = true;
                    numOfBlack++;
                }
            }

            posSet = nextPosSet;
        }

        System.out.println(count);
    }

    public static class Pos {
        public int i;
        public int j;

        public Pos(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pos pos = (Pos) o;
            return i == pos.i &&
                    j == pos.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}
