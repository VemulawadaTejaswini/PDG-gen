import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int price[] = new int[n];
        int skillUpValue[][] = new int[n][];

        for(int i = 0; i < n; i++){//多次元配列の生成（長さnの配列、配列の各要素はmの配列）
            price[i] = sc.nextInt();//値段の配列の生成
            int skill[] = new int[m];
            for(int k = 0; k < m; k++){
                skill[k] = sc.nextInt();
            }
            skillUpValue[i] = skill;
        }

        int min = 1200001;
        int s[] = new int[m];
        for(int i = 0; i < m;i++){
            int a = 0;
            for(int k = 0; k < n;k++){
                a += skillUpValue[k][i];
            }
            s[i] = a;//各インデックスの合計値のリスト
            if(a < min){//配列の各インデックスの合計のminをだす
                min = a;
            }
        }

        //System.out.println(Arrays.toString(s));

        if(min < x){//xを超えない奴が一つでもあれば
            System.out.println(-1);
            return;
        }

        int ans = 0;
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

        //System.out.println(Arrays.toString(price));

        System.out.println(ans);
    }

    static int maxIndex(int[] list){
        int max = 0;
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
