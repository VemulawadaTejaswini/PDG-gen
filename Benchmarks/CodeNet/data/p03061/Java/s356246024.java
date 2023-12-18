import java.util.*;

public class Main{

    static int gcd(int a, int b) {//最大公約数を求める
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        int[] a = new int[n];
        //int min = Integer.MAX_VALUE;
        //int num;//最大公約数
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        /*int tmp;
        int x;
        int y;*/
        /*while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        num = y;*/
        //System.out.println(num);
        for(int i = 2; i < n; i++){
            a[i] = sc.nextInt();
            /*x = Math.max(num, a[i]);
            y = Math.min(num, a[i]);
            //min = Math.min(a[i], min);
            while ((tmp = x % y) != 0) {
                x = y;
                y = tmp;
            }
            num = y;*/
        }
        //System.out.println(num);
        int ans = 0;
        //boolean b = true;
        /*for(int i = 1; i < min + 1; i++){
            for(int j = 0;j < n; j++){
                if(a[j] % i != 0) b = false;
            }
            if(b) ans = Math.max(i, ans);
            b = true;
        }*/
        /*for(int i = 0; i < n; i++){
            for(int j = 1; j < num + 1; j++){
                for(int k = 0; k < n; k++){
                    if(k != i && a[k] % j != 0){
                        b = false;
                        break;
                    }
                }
                if(b) ans = Math.max(j, ans);
                b = true;
            }
        }*/
        int l = 0;
        for(int i = 0; i < n; i++){
            boolean flag = false;
            if(n == 2){
                ans = Math.max(a[0], a[1]);
                break;
            }
            if(i != 0 && i != 1){
                /*x = Math.max(a[0], a[1]);
                y = Math.min(a[0], a[1]);
                while ((tmp = x % y) != 0) {
                    x = y;
                    y = tmp;
                }
                l = y;*/
                l = gcd(a[0], a[1]);
                if(gcd(a[0], a[1]) == 1 && !flag){
                    flag = true;
                }
            }else if(i == 0){
                /*x = Math.max(a[2], a[1]);
                y = Math.min(a[2], a[1]);
                while ((tmp = x % y) != 0) {
                    x = y;
                    y = tmp;
                }
                l = y;*/
                l = gcd(a[2], a[1]);
                if(gcd(a[2], a[1]) == 1 && !flag){
                    flag = true;
                }
            }else if(i == 1){
                /*x = Math.max(a[0], a[2]);
                y = Math.min(a[0], a[2]);
                while ((tmp = x % y) != 0) {
                    x = y;
                    y = tmp;
                }
                l = y;*/
                l = gcd(a[0], a[2]);
                if(gcd(a[0], a[0]) == 1 && !flag){
                    flag = true;
                }
            }
            //for(int j = 2; j < n; j++){
            for(int j = 0; j < n; j++){
                if(i != j){
                    /*x = Math.max(l, a[j]);
                    y = Math.min(l, a[j]);
                    while ((tmp = x % y) != 0) {
                        x = y;
                        y = tmp;
                    }
                    l = y;*/
                    l = gcd(l, a[j]);
                    if(gcd(a[0], a[1]) == 1 && !flag){
                        flag = true;
                    }else if(gcd(a[0], a[1]) == 1 && flag){
                        break;
                    }
                }
            }
            ans = Math.max(l, ans);
        }

        // 出力
        System.out.println(ans);

    }

}