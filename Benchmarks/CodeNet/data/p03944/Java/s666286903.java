import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();

        int[][] square = new int[h][w];

        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();

            switch(a) {
                case 1:
                    square = usedArea1(square, x, h);
                    break;
                case 2:
                    square = usedArea2(square, x, w, h);
                    break;
                case 3:
                    square = usedArea3(square, y, w);
                    break;
                case 4:
                    square = usedArea4(square, y, w, h);
                    break;
            }
        }
        //System.out.println(java.util.Arrays.deepToString(square));
        int count = 0;
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                if(square[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }

    public static int[][] usedArea1(int[][] square, int x, int h) {
        for(int i=0; i<h; i++) {
            for(int j=0; j<x; j++) {
                square[i][j] = 1;
            }
        }
        return square;
    }

    public static int[][] usedArea2(int[][] square, int x, int w, int h) {
        for(int i=0; i<h; i++) {
            for(int j=x; j<w; j++) {
                square[i][j] = 1;
            }
        }
        return square;
    }

    public static int[][] usedArea3(int[][] square, int y, int w) {
        for(int i=0; i<y; i++) {
            for(int j=0; j<w; j++) {
                square[i][j] = 1;
            }
        }
        return square;
    }

    public static int[][] usedArea4(int[][] square, int y, int w, int h) {
        for(int i=y; i<h; i++) {
            for(int j=0; j<w; j++) {
                square[i][j] = 1;
            }
        }
        return square;
    }
}
