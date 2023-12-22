import java.awt.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int ch = sc.nextInt();
        int cw = sc.nextInt();
        int dh = sc.nextInt();
        int dw = sc.nextInt();

        int[][] field = new int[h + 1][w + 1];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                field[i + 1][j + 1] = (s.charAt(j) == '.') ? Integer.MAX_VALUE : -1;
            }
        }


        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};


        int count = 0;

        LinkedList<Point> list2 = new LinkedList<>();
        LinkedList<Point> list = new LinkedList<>();
        list.add(new Point(ch, cw));
        while(!list.isEmpty()) {
            while (!list.isEmpty()) {
                Point p = list.poll();
                field[p.x][p.y] = count;
                list2.add(new Point(p.x, p.y));
                for (int i = 0; i < 4; i++) {
                    int xx = p.x + dx[i];
                    int yy = p.y + dy[i];

                    if (xx < 0 || yy < 0 || xx > h || yy > w) {
                        continue;
                    }
                    if (field[xx][yy] == Integer.MAX_VALUE) {
                        list.add(new Point(xx, yy));
                    }
                }
                //printIntArray(field);
            }
            while (!list2.isEmpty()) {
                Point pp = list2.poll();
                for (int i = -2; i < 3; i++) {
                    for (int j = -2; j < 3; j++) {
                        int xx = pp.x + i;
                        int yy = pp.y + j;

                        if (xx < 0 || yy < 0 || xx > h || yy > w) {
                            continue;
                        }
                        if (field[xx][yy] == Integer.MAX_VALUE) {
                            list.add(new Point(xx, yy));
                        }
                    }
                }
            }
            count++;
        }

        System.out.println(field[dh][dw]);

        //printIntArray(field);

    }

    static void printIntArray(int[][] array, int digit, int y, int x, int h, int w) {
        String format = "%" + digit + "." + digit + "s";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int element = array[y + i][x + j];
                switch (element) {
                    case Integer.MAX_VALUE:
                        sb.append("\u001b[00;44m");//BLUE
                        sb.append(' ');
                        sb.append(String.format(format, "MAX"));
                        sb.append("\u001b[00m");
                        break;

                    case Integer.MIN_VALUE:
                        sb.append("\u001b[00;41m");//RED
                        sb.append(' ');
                        sb.append(String.format(format, "MIN"));
                        sb.append("\u001b[00m");
                        break;

                    case Integer.MAX_VALUE / 10:
                        sb.append("\u001b[00;42m");//GREEN
                        sb.append(' ');
                        sb.append(String.format(format, element));
                        sb.append("\u001b[00m");
                        break;

                    case Integer.MIN_VALUE / 10:
                        sb.append("\u001b[00;43m");//YELLOW
                        sb.append(' ');
                        sb.append(String.format(format, element));
                        sb.append("\u001b[00m");
                        break;

                    default:
                        if (element >= Math.pow(10, digit)) {
                            sb.append("\u001b[00;34m");//BLUE
                            sb.append(' ');
                            sb.append(String.format(format, element));
                            sb.append("\u001b[00m");
                        } else if (element <= -Math.pow(10, digit)) {
                            sb.append("\u001b[00;31m");//RED
                            sb.append('-');
                            sb.append(String.format(format, -element));
                            sb.append("\u001b[00m");
                        } else if (element <= -Math.pow(10, digit - 1)) {
                            sb.append('-');
                            sb.append(String.format(format, -element));
                        } else {
                            sb.append(' ');
                            sb.append(String.format(format, element));
                        }
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    static void printIntArray(int[][] array, int y, int x, int h, int w) {
        printIntArray(array, 3, y, x, h, w);
    }

    static void printIntArray(int[][] array, int digit) {
        printIntArray(array, digit, 0, 0, array.length, array[0].length);
    }

    static void printIntArray(int[][] array) {
        printIntArray(array, 3, 0, 0, array.length, array[0].length);
    }
}
