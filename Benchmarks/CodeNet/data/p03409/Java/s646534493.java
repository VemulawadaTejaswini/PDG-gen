/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.applet.Applet;
import java.util.*;
import java.awt.*;
import java.awt.Graphics.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        Point[] red=new Point[n];
        for (int i=0;i<n;i++)red[i]=new Point(sc.nextInt(),sc.nextInt());
        Point[] blue=new Point[n];
        for (int i=0;i<n;i++)blue[i]=new Point(sc.nextInt(),sc.nextInt());
        Arrays.sort(blue,(p1,p2)->p1.x-p2.x);
        int ans=0;
        for (int i = 0; i < n; i++) {
            int red_y=-1;
            int red_index=-1;
            for (int j = 0; j < n; j++) {
                if(d(blue[i],red[j])){
                    if(red_y<red[j].y){
                        red_index=j;
                    }
                }
            }
            if(red_index>-1){
                ans++;
                red[red_index].y=Integer.MAX_VALUE;
            }
        }
        out.println(ans);
    }
    static boolean d(Point blue,Point red){
        return red.x<blue.x&&red.y<blue.y;
    }
}