import java.util.ArrayList;
import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // ひとつめの町の転送先
        int temp = a[0];
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(temp);

        // ループの先頭の町がリストの何番目にあるかを格納する変数
        int check = 0;

        for (int i = 1; i < n; i++) {
            temp = a[temp];
            // 訪れた町かチェック
            // 訪れていた場合、ループ前のイントロ部分の長さを求める
            if (list.contains(temp)) {
                check = list.indexOf(temp);
            	break;
            }
            list.add(temp);
        }

        if ((long)list.size() == k){
            System.out.println(temp);
        } else {
            int std = (int)((k-check) % (list.size() - check));

            System.out.println(list.get(std + check - 1));
        }
    }
}