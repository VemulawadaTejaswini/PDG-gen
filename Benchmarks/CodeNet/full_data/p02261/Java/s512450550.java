import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //カードの枚数
    String[] x = new String[n];
    String[] bubble = new String[n];
    String[] select = new String[n];
    for (int i=0; i<n; i++) { //カードを読み込む
        x[i] = sc.next();
        bubble[i] = x[i];
        select[i] = x[i];
    }
    //バブルソート
    bubbleSort(bubble);
    //選択ソート
    selectSort(select);
    //安定or不安定判定
    String result = isStable(bubble, select);
    //結果を出力
    out(bubble,"Stable");
    out(select,result);
    }
    /**
     * 選択ソート
     */
    public static void selectSort(String[] x) {
        for(int i=0; i<x.length; i++) {
            int minj = i; //最小値の位置
            for(int j=i; j<x.length; j++) {
                //カードの数字が最小値の位置を見つける
                if(x[j].charAt(1)<x[minj].charAt(1)) minj = j;
            }
            //未ソートの先頭が最小値でない場合、先頭と最初値を入れ替える
            if(i != minj) {
                String a = x[i];
                x[i] = x[minj];
                x[minj] = a;
            }
        }
    }
    /**
     * バブルソート
     */
    public static void bubbleSort(String[] x) {
        for(int i=x.length-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if(x[j].charAt(1)>x[j+1].charAt(1)){
                    String a = x[j];
                    x[j] = x[j+1];
                    x[j+1] = a;
                }
            }
        }
    }
    /**
     * 安定 or 不安定
     */
    public static String isStable(String[] s,String[] b) {
        if(Arrays.equals(s, b)) {
            return "Stable";
        } else {
            return "Not stable";
        }
    }
    /**
     * 出力
     */
    public static void out(String[] s,String r) {
        for (int i=0; i<s.length-1; i++) {
            System.out.print(s[i]+" ");
        }
        System.out.print(s[s.length-1]);
        System.out.println();
        System.out.println(r);
    }
}

