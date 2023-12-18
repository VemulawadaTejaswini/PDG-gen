/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        String[] s=sc.next().split("/");
        int m=Integer.parseInt(s[1]);
        int d=Integer.parseInt(s[2]);
        if(m<4){
            out.println("Heisei");
        }else if(m==4){
            if(d<=30)out.println("Heisei");
            else out.println("TDB");
        }else out.println("TDB");
    }
}