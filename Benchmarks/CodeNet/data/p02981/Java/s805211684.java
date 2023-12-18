import java.util.*;
import java.awt.*;

class Main {

    private static Scanner sc = new Scanner(System.in);
    //ソート系
    /*
    *ソート(配列) Arrays.sort(配列名);
    *ソート(リスト)Collections.sort(foo);
    *逆順ソート(配列) Arrays.sort(配列名,  Collections.reverseOrder());
    *逆順ソート(リスト) Collections.reverse(リスト名);
    */

    //変換系
    /*
    *String to int : Integer.parseInt();
    *
    */

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());


        int ans = (n*a < b) ? n*a : b;
        System.out.println(ans);
        
    }
}
