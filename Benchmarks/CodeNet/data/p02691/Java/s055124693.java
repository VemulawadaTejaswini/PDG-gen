import java.util.*;

public class Main {
    public static void main(String args[]) {

        //X[k] = k - A[k]
        //Y[k] = i + A[i]
        //k > i

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        Map<Integer,Integer> x_map = new HashMap<>();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int k = 1; k <= n; k++) {//key:X[k],value:X[k]の個数、のMapを作る
            int inputNum = sc.nextInt();
            x[k-1] = k - inputNum;//X[k]の配列を作る（番号とindexのずれに注意）

            if(x_map.containsKey(x[k-1])){
                x_map.replace(x[k-1],x_map.get(x[k-1]) + 1);
            }else{
                x_map.put(x[k-1],1);
            }

            y[k-1] = k + inputNum;//Y[i]の配列を作る（番号とindexのずれに注意）
        }

        for(int i = 1; i < n; i++){
            x_map.replace(x[i-1],x_map.get(x[i-1]) - 1);//k > iを維持するためにx[i]がkeyのvalue（）をカウントしている1つ分は毎回取り除く
            if(x_map.containsKey(y[i-1])){
                count += x_map.get(y[i - 1]);//y[i]と同じ値をもつx[i]の個数（iに対してkが成立するペアの数）をcountに投げ込む
            }
        }
        System.out.println(count);
    }
}
