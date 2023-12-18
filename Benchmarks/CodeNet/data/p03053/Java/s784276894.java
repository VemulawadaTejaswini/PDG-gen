// This template is based on Mr. tonymontaro's template (https://atcoder.jp/users/tonymontaro).
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

// For flatten() required Java8
import java.util.stream.Stream;
import java.util.stream.IntStream;

import java.util.Queue;
import java.util.ArrayDeque;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static PrintWriter out;
    static CF_Reader in;

    public static void main(String[] args) throws IOException {
        out = new PrintWriter(new OutputStreamWriter(System.out));
        in = new CF_Reader();
        StringBuilder result = new StringBuilder();

        // Start: int型の整数N Mを取得する
        // // N M 形式
        // int N = in.intNext();
        // int M = in.intNext();
        //[補足]
        // N M
        // A B 形式だと
        int H = in.intNext();
        int W = in.intNext();
        // int A = in.intNext();
        // int B = in.intNext();
        // End: int型の整数N Mを取得する

        int[][] map = new int[H][W];

        Queue<int[]> queue = new ArrayDeque<int[]>();

        int[][] memo = new int[H][W]; // 訪問済みかメモする

        for (int i = 0; i < H; i++) {
          String text = in.next();
          for (int j = 0; j < text.length(); j++) {
            char c = text.charAt(j);
            if (c == '.') {
              map[i][j] = 0;
            } else if (c == '#') {
              int startY = i;
              int startX = j;

              int[] start = {startY, startX};
              queue.add(start);
              memo[startY][startX] = 1;

              map[i][j] = 1;
            }
          }
        }

        int sum = 0;
        while(!queue.isEmpty()) {
          Queue<int[]> queue2 = new ArrayDeque<int[]>();
          while(!queue.isEmpty()) {
            int[] currentPoint = queue.poll();

            int currentY = currentPoint[0];
            int currentX = currentPoint[1];
            // out.println("(y, x) = (" + currentY + ", " + currentY + ")");

            if (H == 1 && W == 1) {
              break;
            }
            if (currentY == 0 && currentX == 0) {
              if (memo[currentY + 1][currentX] != 1) {
                int[] point = {currentY + 1, currentX};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
              if (memo[currentY][currentX + 1] != 1) {
                int[] point = {currentY, currentX + 1};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
            } else if (currentY == H - 1 && currentX == 0) {
              if (memo[currentY - 1][currentX] != 1) {
                int[] point = {currentY - 1, currentX};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
              if (memo[currentY][currentX + 1] != 1) {
                int[] point = {currentY, currentX + 1};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
            } else if (currentY == H - 1 && currentX == W - 1) {
              if (memo[currentY - 1][currentX] != 1) {
                int[] point = {currentY - 1, currentX};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
              if (memo[currentY][currentX - 1] != 1) {
                int[] point = {currentY, currentX - 1};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
            } else if (currentY == 0 && currentX == W - 1) {
              if (memo[currentY + 1][currentX] != 1) {
                int[] point = {currentY + 1, currentX};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
              if (memo[currentY][currentX - 1] != 1) {
                int[] point = {currentY, currentX - 1};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
            } else if (currentY == 0 && currentX != 0 && currentX != W - 1) {
              if (memo[currentY][currentX + 1] != 1) {
                int[] point = {currentY, currentX + 1};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
              if (memo[currentY][currentX - 1] != 1) {
                int[] point = {currentY, currentX - 1};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
            } else if (currentX == 0 && currentY != 0 && currentY != H - 1) {
              if (memo[currentY + 1][currentX] != 1) {
                int[] point = {currentY + 1, currentX};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
              if (memo[currentY - 1][currentX] != 1) {
                int[] point = {currentY - 1, currentX};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
            } else if (currentX == W - 1 && currentY != 0 && currentY != H - 1) {
              if (memo[currentY + 1][currentX] != 1) {
                int[] point = {currentY + 1, currentX};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
              if (memo[currentY - 1][currentX] != 1) {
                int[] point = {currentY - 1, currentX};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
            } else if (currentY == H - 1 && currentX != 0 && currentX != W - 1) {
              if (memo[currentY][currentX + 1] != 1) {
                int[] point = {currentY, currentX + 1};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
              if (memo[currentY][currentX + 1] != 1) {
                int[] point = {currentY, currentX + 1};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
            } else {
              if (memo[currentY + 1][currentX] != 1) {
                int[] point = {currentY + 1, currentX};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
              if (memo[currentY - 1][currentX] != 1) {
                int[] point = {currentY - 1, currentX};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
              if (memo[currentY][currentX + 1] != 1) {
                int[] point = {currentY, currentX + 1};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
              if (memo[currentY][currentX - 1] != 1) {
                int[] point = {currentY, currentX - 1};
                memo[point[0]][point[1]] = 1;
                queue2.add(point);
              }
            }
          }

          while(!queue2.isEmpty()) {
            queue.add(queue2.poll());
          }
          sum++;
        }

        // for (int i = 0; i < H; i++) {
        //   for (int j = 0; j < W; j++) {
        //     out.print(memo[i][j]);
        //     out.print(" ");
        //   }
        //   out.println();
        // }
        result.append(sum - 1);


        // Start: int型の整数Nと配列Aを取得する
        // // N
        // // A1 A2 A3... AN 形式
        // int n = in.intNext();
        // int[] A = in.nextIntArray(n);
        // End: int型の整数Nと配列Aを取得する

        // Start: Char型の文字をInt型に変換する
        // Integer.parseInt(String.valueOf(charText))
        // End: Char型の文字をInt型に変換する

        // Start: 文字列を1文字ずつ出力する
        // String text = in.next();
        // char[] work = new char[text.length()];
        // for(int i = 0; i < text.length(); i++){
        //   work[i] = text.charAt(i); // Char型の文字
        //   out.println(work[i]);
        // }
        // End: 文字列を1文字ずつ出力する

        // Start: 配列の定義
        // int[] a = new int[N];
        // int[][] b = new int[N][M];
        // End: 配列の定義

        // Start: キューの定義
        // Queue<int[]> queue = new ArrayDeque<int[]>();
        // Start: キューの定義

        // Start: リストのリスト
        // @SuppressWarnings("unchecked")
        // List<Integer>[] adjacents = new ArrayList[N];
        // Start: リストのリスト

        // Start: forEach文
        // for (int elem: elements) {
        // }
        // Start: forEach文

        out.println(result);

        out.close();
    }

    public static int[] flatten(int[][] arr) {
       return Stream.of(arr)
          .flatMapToInt(row -> IntStream.of(row))
          .toArray();
    }

    public static int maxIntValueFromArray(int[] array) {

        int intMax = array[0];

        for (int i = 1; i < array.length; i++ ) {
            if(intMax < array[i]) {
                intMax = array[i];
            }
        }
        return intMax;
    }

    public static int minIntValueFromArray(int[] array) {

        int intMin = array[0];

        for (int i = 1; i < array.length; i++ ) {
            if(intMin > array[i]) {
                intMin = array[i];
            }
        }
        return intMin;
    }

    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long longNext() throws IOException {
            return Long.parseLong(next());
        }

        int intNext() throws IOException {
            return Integer.parseInt(next());
        }

        double doubleNext() throws IOException {
            return Double.parseDouble(next());
        }

        char charNext() throws IOException {
            return next().charAt(0);
        }

        public int[] nextIntArray(final int n) throws IOException {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = intNext();
            return a;
        }

        public long[] nextLongArray(final int n) throws IOException {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = longNext();
            return a;
        }

        String line() throws IOException {
            return br.readLine().trim();
        }
    }
}