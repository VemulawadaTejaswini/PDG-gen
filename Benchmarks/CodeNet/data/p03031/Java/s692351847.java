import java.util.*;

public class Main{
    static int n;
    static int m;
    static int[][] l;
    static int[] k = new int[10];
    static int[] p;
    static int count = 0;
    static int[] st = new int[10];

    static void check(){
        /*for(int j = 0; j < n; j++){
            System.out.print(st[j] + " ");
        }
        System.out.println();*/
        int sum;
        for(int i = 0; i < m; i++){
            sum = 0;
            for(int j = 0; j < k[i]; j++){
                sum += st[l[i][j] - 1];
                //System.out.println(l[i][j]);
                //System.out.println("sum +=" + " " + st[l[i][j] - 1] + ", " + "sum = " + sum);
            }
            if(sum % 2 != p[i]) return;
        }
        //System.out.println("!");
        count++;
    }

    static void calc(int i, int v){
        if(i == n - 1){
            st[i] = v;
            /*for(int j = 0; j < n; j++){
                System.out.print(st[j] + " ");
            }
            System.out.println();*/
            check();
            //System.out.println("Check");
        }else{
            st[i] = v;
            /*for(int j = 0; j < n; j++){
                System.out.print(st[j] + " ");
            }
            System.out.println();*/
            calc(i + 1, 0);
            calc(i + 1, 1);
        }
    }

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		n = sc.nextInt();
        m = sc.nextInt();
        l = new int[10][10];

        for(int i = 0; i < m; i++){
            k[i] = sc.nextInt();
            for(int j = 0; j < k[i]; j++){
                l[i][j] = sc.nextInt();
            }
        }

        p = new int[m];

        for(int i = 0; i < m; i++){
            p[i] = sc.nextInt();
        }

        calc(0, 0);
        calc(0, 1);

        // 出力
        System.out.println(count);

    }

}