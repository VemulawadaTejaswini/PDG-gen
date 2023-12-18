import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] l = new int[m][3];
        int[] x = new int[n];

        for(int i=0; i<m; i++){
            l[i][0] = sc.nextInt()-1;
            l[i][1] = sc.nextInt()-1;
            l[i][2] = sc.nextInt();
        }

        //Comparatorインターフェイスを実装したクラスを作成
        Comp comp = new Comp();

        for(int i=0; i<m; i++){
            if(l[i][0] > l[i][1]){
                int tmp = l[i][0];
                l[i][0] = l[i][1];
                l[i][1] = tmp;
                l[i][2] = -l[i][2];
            }
        }

        //2次元目のインデックス0番でソート
        comp.set_index(0);
        //Arraysクラスのsort()を実行する
        Arrays.sort(l, comp);

        Arrays.fill(x, -1000000007);

        

        for(int i=0; i<m; i++){
            if(x[l[i][0]] == -1000000007){
                x[l[i][0]] = 0;
            }
            if(x[l[i][1]] == -1000000007){
                x[l[i][1]] = x[l[i][0]] + l[i][2];
            }else if(x[l[i][1]] - x[l[i][0]] != l[i][2]){
                System.out.println("No");
                return;
            }

            if(x[l[i][1]] > 1000000000 || x[l[i][1]] < -1000000000){
                System.out.println("No");
                return;
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(x[i] > max) max = x[i];
            if(x[i] < min) min = x[i]; 
        }

        if(max - min > 1000000000){
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
}

class Comp implements Comparator {

    int index = 0;

    public void set_index (int i) {
        index = i;
    }

    public int compare (Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_a[index] - int_b[index]);
    }

}