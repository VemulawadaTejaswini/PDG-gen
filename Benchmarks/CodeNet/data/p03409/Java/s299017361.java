
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] redList = new int[n][2];
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            redList[i][0] = a;
            redList[i][1] = b;
        }

        int[][] blueList = new int[n][2];
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            blueList[i][0] = a;
            blueList[i][1] = b;
        }

        int ans = calc(redList, blueList);
        System.out.println(ans);

        sc.close();
    }

    static int calc(int[][] redList, int[][] blueList) {
//        System.out.println(redList);
        if (redList.length == 0) return 0;
        int[] result = new int[blueList.length+1]; // TODO

        int[] redPoint = redList[redList.length-1];
        redList = Arrays.copyOf(redList, redList.length-1);
        for (int i = 0; i < blueList.length; i++) {
            if (redPoint[0] < blueList[i][0] && redPoint[1] < blueList[i][1]) {
                int[][] blueList2 = new int[blueList.length-1][2];
                for (int j = 0; j < i; j++) {
                    blueList2[j] = blueList[j];
                }
                for (int j = i+1; j < blueList.length; j++) {
                    blueList2[j-1] = blueList[j];
                }
//                Point bluePoint = blueList2.remove(i);
//                System.out.println("[IN ]red:" + redPoint + " / blue:" + bluePoint);
                result[i] = 1 + calc(Arrays.copyOf(redList, redList.length), blueList2);
//                System.out.println("[OUT]red:" + redPoint + " / blue:" + bluePoint + ", result:" + result[i]);
            }
        }
//        result[blueList.size()] = calc(new ArrayList<>(redList), new ArrayList<>(blueList));
        result[blueList.length] = calc(redList, blueList);

        int max = 0;
        for (int i = 0; i <= blueList.length; i++) {
            if (max < result[i]) max = result[i];
        }

        return max;
    }

    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isGood(Point o) {
            return ((x < o.x) && (y < o.y));
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

}
