import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    static class square {
        int width;

        square(int width, int height) {
            this.width = width;
            this.height = height;
        }

        int height;

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }

    public static void main(String[] args) {
        Comparator wSort = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int width1 = ((square) o1).getWidth();
                int width2 = ((square) o2).getWidth();

                return width2 - width1;
            }
        };

        Comparator hSort = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int height1 = ((square) o1).getHeight();
                int height2 = ((square) o2).getHeight();

                return height2 - height1;
            }
        };

        while (true) {
            int N = s.nextInt();
            if (N == 0) break;

            square[] data = new square[N];
            data[0] = new square(0, 0);

            for (int i = 1; i < N; i++) {
                int num = s.nextInt();
                int direction = s.nextInt();
                int width;
                int height;

                if (direction == 0) {
                    width = data[num].width - 1;
                    height = data[num].height;
                    data[i] = new square(width, height);
                } else if (direction == 1) {
                    width = data[num].width;
                    height = data[num].height - 1;
                    data[i] = new square(width, height);
                } else if (direction == 2) {
                    width = data[num].width + 1;
                    height = data[num].height;
                    data[i] = new square(width, height);
                } else if (direction == 3) {
                    width = data[num].width;
                    height = data[num].height + 1;
                    data[i] = new square(width, height);
                }
            }

            Arrays.sort(data, wSort);
            int maxWidth = data[0].width - data[N - 1].width + 1;
            Arrays.sort(data, hSort);
            int maxHeight = data[0].height - data[N - 1].height + 1;

            System.out.println(maxWidth + " " + maxHeight);
        }
    }


}