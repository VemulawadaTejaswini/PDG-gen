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
    public static double distance(double[] a,double[] b){
        double dis = 0;
        for(int i = 0;i< a.length; i++){
            dis+=Math.pow(a[i] - b[i],2);
        }
        return Math.sqrt(dis);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());

        double x[][] = new double[n][d];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < d; j++){
                x[i][j]=Double.parseDouble(sc.next());
            }        
        }
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i==j)continue;
                double dis = distance(x[i],x[j]);
                if(dis == (int)dis){
                    ans++;
                }
            }
        }
        System.out.println(ans/2);

        
    }
}
