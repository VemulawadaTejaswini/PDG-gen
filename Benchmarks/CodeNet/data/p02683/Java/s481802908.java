import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long x = sc.nextLong();

        long price[] = new long[n];
        long skillUpValue[][] = new long[n][];

        for(int i = 0; i < n; i++){//多次元配列の生成（長さnの配列、配列の各要素はmの配列）
            price[i] = sc.nextLong();//値段の配列の生成
            long skill[] = new long[m];
            for(int k = 0; k < m; k++){
                skill[k] = sc.nextLong();
            }
            skillUpValue[i] = skill;
        }

        long min = 1200001;
        long s[] = new long[m];
        for(int i = 0; i < m;i++){
            long a = 0;
            for(int k = 0; k < n;k++){
                a += skillUpValue[k][i];
            }
            s[i] = a;//各インデックスの合計値のリスト
            if(a < min){//配列の各インデックスの合計のminをだす
                min = a;
            }
        }

        if(min < x){//xを超えない奴が一つでもあれば不可能
            System.out.println(-1);
            return;
        }

        long ans = 0;
        outside: for(int i = 0; i < n; i++){
            int index = maxIndex(price);//Cが大きい順にやる
            for(int k = 0; k < m;k++){
                if(s[k]-skillUpValue[index][k] < x){
                    ans += price[index];
                    price[index] = 0;
                    continue outside;//一つでもxを下回るなら消せない
                }
            }
            //下回らないならそれは不要
            for(int k = 0; k < m;k++){
                s[k] -= skillUpValue[index][k];
            }
            price[index] = 0;
        }
        System.out.println(ans);
    }

    static int maxIndex(long[] list){
        long max = 0;
        int index = -1;
        for(int i = 0; i < list.length;i++){
            if(list[i] >= max){
                max = list[i];
                index = i;
            }
        }
        return index;
    }
}
