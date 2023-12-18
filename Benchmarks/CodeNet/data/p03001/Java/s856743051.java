import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int w = sc.nextInt();
        // スペース区切りの整数の入力
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        double ans;
        double a = 0.0, b = 0.0;
        int c = 0;

        if((x == 0 || x == w) && (y == 0 || y == h)){
            ans = w * h / 2.0;
            c = 0;
        }else if(x == 0 || x == w){
            ans = Math.min(w * y, w * (h - y));
            c = 0;
        }else if(y == 0 || y == h){
            ans = Math.min(x * h, (w - x) * h);
            c = 0;
        }else{
            ans = Math.max(Math.min(x * h, (w - x) * h), Math.min(w * y, w * (h - y)));
            if(Math.min(x * h, (w - x) * h) == Math.min(w * y, w * (h - y))) c = 1;
        }

        /*ans = Math.max(Math.min(x * h, (w - x) * h), Math.min(w * y, w * (h - y)));
        if(Math.min(x * h, (w - x) * h) == Math.min(w * y, w * (h - y))) b = 1;
        else b = 0;*/

        // 出力
        System.out.println(String.format("%.9f", ans) + " " + c);

    }

}