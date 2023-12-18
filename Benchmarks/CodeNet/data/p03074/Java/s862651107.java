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
Point2D p2d=new Point2D.Double(d1,d2);
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
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        if(s.charAt(0)=='0'){
            int c=s.charAt(0);
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)==c){
                    count++;
                }else {
                    list.add(count);
                    c=s.charAt(i);
                    i--;
                    count=0;
                }
            }
            if(count>0){
                list.add(count);
            }
            int[] a=new int[list.size()];
            count=0;
            for (Integer e:list){
                a[count++]=e;
            }
            int len=a.length;
            if(len<=2||len<=2*k){
                out.println(n);
                out.close();
                System.exit(0);
            }
            int t=0,ans=0;
            for (int i = 0; i < 2 * k; i++) {
                t+=a[i];
            }
            ans=t;
            for (int i = 1; i < len; i++) {
                a[i]+=a[i-1];
            }
            for (int i = 1; i < len-2*k; i+=2) {
                ans=max(ans,a[max(len-1,i+2*k)]-a[i-1]);
            }
            out.println(ans);
        }else {
            int c=s.charAt(0);
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)==c){
                    count++;
                }else {
                    list.add(count);
                    c=s.charAt(i);
                    i--;
                    count=0;
                }
            }
            if(count>0){
                list.add(count);
            }
            int[] a=new int[list.size()+1];
            count=1;
            for (Integer e:list){
                a[count++]=e;
            }
            int len=a.length;
            if(len<=3||len-1<=2*k+1){
                out.println(n);
                out.close();
                System.exit(0);
            }
            
            for (int i = 1; i < len; i++) {
                a[i]+=a[i-1];
            }
            int ans=0;
            for (int i = 1; i <len; i+=2) {
                ans=max(ans,a[min(len-1,2*k+i)]-a[i-1]);
            }
            out.println(ans);
        }
        out.close();
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc     {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static String nextLine() {
            return s.nextLine();
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

        static boolean hasNext() {
            return s.hasNext();
        }
    }
}