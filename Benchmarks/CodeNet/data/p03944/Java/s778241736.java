import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] a = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        boolean[][] masu = new boolean[w+1][h+1];
        for (int i = 0; i < w+1; i++) {
            for (int j = 0; j < h+1; j++) {
                masu[i][j] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w; j++) {
                for (int k = 0; k < h; k++) {
                    if(a[i] == 1 && x[i] > j){
                        masu[j][k] = false;
                    }else if (a[i] == 2 && x[i] <= j){
                        masu[j][k] = false;
                    }else if (a[i] == 3 && y[i] > k){
                        masu[j][k] = false;
                    }else if (a[i] == 4 && y[i] <= k){
                        masu[j][k] = false;
                    }
                }
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if(masu[i][j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}

class io{
    public static void br(){
        System.out.println("");
    }

    public static void YesNo(boolean f) {
        System.out.println(f?"Yes":"No");
    }
    public static void YESNO(boolean f) {
        System.out.println(f?"YES":"NO");
    }

}

class Algo{
    public static boolean isOdd(int n){
        return n % 2 == 1;
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }


}

