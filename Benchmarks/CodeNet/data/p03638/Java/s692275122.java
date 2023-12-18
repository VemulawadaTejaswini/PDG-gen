/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
ArrayDequeではpopとpushはStackと同じ操作になる
*/
//入力終了→Ctrl+D
import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        Point[] p=new Point[h*w];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(i%2==0){
                    p[count++]=new Point(i,j);
                }else {
                    p[count++]=new Point(i,w-1-j);
                }
            }
        }
        int[][] c=new int[h][w];
        count=0;
        for (int i = 0; i < n; i++) {
            int color=i+1;
            for (int j = 0; j < a[i]; j++) {
                c[p[count].x][p[count].y] = color;
                count++;
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                out.print(c[i][j]);
                if(j<w-1)out.print(" ");
            }
            out.println();
        }
    }

    static class sc {
        static Scanner s = new Scanner(in);

        static String next() {
            return s.next();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }
    }
}