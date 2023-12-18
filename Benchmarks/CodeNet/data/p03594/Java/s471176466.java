import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static int NONE = 0;
    static int R = 1, Y = 2, G = 3, B = 4;
    static int h, w, d;
    static int[] colors = new int[]{R, Y, G, B};

    static boolean isValid(int[][] arrs, int a, int b, int color) {
        int i = a - d;
        int j = b;
        for(int k = 0; k < d; k++) {
            i++;
            j++;
            if(0 <= i&& i < h && 0 <= j && j < w) {
                if(arrs[i][j] == color) return false;
            }
        }
        for(int k = 0; k < d; k++) {
            i++;
            j--;
            if(0 <= i&& i < h && 0 <= j && j < w) {
                if(arrs[i][j] == color) return false;
            }
        }
        for(int k = 0; k < d; k++) {
            i--;
            j--;
            if(0 <= i&& i < h && 0 <= j && j < w) {
                if(arrs[i][j] == color) return false;
            }
        }
        for(int k = 0; k < d; k++) {
            i--;
            j++;
            if(0 <= i&& i < h && 0 <= j && j < w) {
                if(arrs[i][j] == color) return false;
            }
        }
        return true;
    }

    static boolean calc(int[][] arrs, int id) {
        if(id == h * w) return true;

        int a = id / w;
        int b = id % w;

        for (int color: colors) {
            if(isValid(arrs, a, b, color)) {
                arrs[a][b] = color;
                boolean isvalid = calc(arrs, id + 1);
                if(isvalid) return true;
                arrs[a][b] = NONE;
            }
        }
        return false;
    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        d = sc.nextInt();

        int[][] arrs = new int[h][w];
        calc(arrs, 0);
        for (int[] arr: arrs){
            for (int ch: arr) {
                if(ch == R) System.out.print("R");
                else if(ch == Y) System.out.print("Y");
                else if(ch == G) System.out.print("G");
                else if(ch == B) System.out.print("B");
            }
            System.out.println();
        }

    }
}