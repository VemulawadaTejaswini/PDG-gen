/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
ArrayDequeではpopとpushはStackと同じ操作になる
//import static java.lang.System.*; はしばらく使わなそう(使うとしてもexit(0)のためだけ)←return;でよさそう
最後にout.flush()またはout.close()をするのを忘れずに！
*/
//入力終了→Ctrl+D
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.Point2D;
//import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int[] dx={0,1,1,1,0,-1,-1,-1};
        int[] dy={-1,-1,0,1,1,1,0,-1};
        while (true) {
            int w = sc.nextInt(), h = sc.nextInt();
            if(w==0&&h==0)break;
            UF.Init(w*h);
            int[][] land=new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    land[i][j]=sc.nextInt();
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if(land[i][j]==0)continue;
                    for (int k = 0; k < 8; k++) {
                        int row=i+dx[k],column=j+dy[k];
                        if(d(w,h,column,row)&&land[row][column]==1){
                            UF.unite(i*w+j,row*w+column);
                            //out.println((i*w+j)+"と"+(row*w+column));
                        }
                    }
                }
            }
            HashSet<Integer> set=new HashSet<>();
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if(land[i][j]==1){
                        set.add(UF.find(i*w+j));
                        //out.println("元:"+UF.find(i*w+j));
                    }
                }
            }
            out.println(set.size());
        }
        out.close();
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

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

    static boolean d(int w,int h,int column,int row){
        return 0<=column&&column<w&&0<=row&&row<h;
    }
    static class UF {
        static int[] d;

        static void Init(int size) {
            d = new int[size];
            for (int i = 0; i < size; i++) {
                d[i] = -1;
            }
        }

        static boolean unite(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) return false;
            if (d[x] > d[y]) {
                int t = d[y];
                d[y] = d[x];
                d[x] = t;
            }
            d[x] += d[y];
            d[y] = x;
            return true;
        }

        static boolean same(int x, int y) {
            return find(x) == find(y);
        }

        static int find(int k) {
            return d[k] < 0 ? k : (d[k] = find(d[k]));
        }

        static int size(int k) {
            return -d[find(k)];
        }
    }
}
