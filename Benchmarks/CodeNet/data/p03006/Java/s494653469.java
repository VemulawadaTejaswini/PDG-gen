
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Main b = new Main();
        final Scanner scanner = new Scanner(System.in);
        final int count = scanner.nextInt();
        final int[][] table = new int[count][2];

        for (int i = 0; i < count; i++) {
            table[i][0] = scanner.nextInt();
            table[i][1] = scanner.nextInt();
        }

        List<Len> lens = new ArrayList<>();
        List<MyInteger> counts = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (table[i][0] > table[j][0]) {
                    final Len len = b.new Len(table[i][0] - table[j][0], table[i][1] - table[j][1]);
                    int index;
                    if((index = lens.indexOf(len)) != -1){
                        counts.get(index).increment();
                    }else{
                        lens.add(len);
                        counts.add(b.new MyInteger());
                    }
                } else {
                    final Len len = b.new Len(table[j][0] - table[i][0], table[j][1] - table[i][1]);
                    int index;
                    if((index = lens.indexOf(len)) != -1){
                        counts.get(index).increment();
                    }else{
                        lens.add(len);
                        counts.add(b.new MyInteger());
                    }
                }
            }
        }
        Collections.sort(counts);
        System.out.println(count - counts.get(0).getInteger());
    }

    class MyInteger implements Comparable {
        private int integer = 1;

        public void increment() {
            this.integer++;
        }

        public int getInteger() {
            return integer;
        }

        @Override
        public int compareTo(final Object o) {
            return ((MyInteger) o).getInteger() - this.integer;
        }
    }

    class Len {
        private final int x;
        private final int y;

        public Len(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(final Object obj) {
            return ((Len) obj).getX() == this.getX() && ((Len) obj).getY() == this.getY();
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
