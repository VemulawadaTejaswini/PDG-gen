import java.util.*;

public class Main {
    public static void main(String args[]) {

        //X[k] = k - A[k]
        //Y[k] = i + A[i]
        //k > i

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//        Map<Integer,Integer> x_map = new HashMap<>();
//        int[] x = new int[n];
//        int[] y = new int[n];

//        for (int k = 1; k <= n; k++) {//key:X[k],value:X[k]の個数、のMapを作る
//            int inputNum = sc.nextInt();
//            x[k-1] = k - inputNum;//X[k]の配列を作る（番号とindexのずれに注意）
//
//            if(x_map.containsKey(x[k-1])){
//                x_map.replace(x[k-1],x_map.get(x[k-1]) + 1);//x[k]に対する値が既に存在していれば1を足す
//            }else{
//                x_map.put(x[k-1],1);//存在していなければ新たにMapに入れる
//            }
//            y[k-1] = k + inputNum;//Y[i]の配列を作る（番号とindexのずれに注意）
//        }
//
//        for(int i = 1; i <= n; i++) {
//            x_map.replace(x[i-1], x_map.get(x[i-1]) - 1);//k > iを維持するためにx[i]がkeyのvalue（）をカウントしている1つ分は毎回取り除く
//
//            //これをやるとvalueが負になる場合があるか？ → ない
//
//            if(x_map.containsKey(y[i-1])){
//                count += x_map.get(y[i - 1]);//y[i]と同じ値をもつx[i]の個数（iに対してkが成立するペアの数）をcountに投げ込む
//            }
//        }

        //第二段 上から潰してみる → 1番目のやつがn番目になってまうからだめや
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long count = 0;
        Map<Long,Long> x_map = new HashMap<>();

        for(long i = n; 1 <= i; i--){
            long A_i = sc.nextInt();//読み込み
            long y_i = i + A_i;
            if(x_map.containsKey(y_i)){//y_iに対応するx_iが存在した時、その個数を足しあげ
                count += x_map.get(y_i);
            }

            long x_i = i - A_i;//足しあげ時点でmapにはiより大きいkでのX[k]しか存在しないようにするため、毎回この時点で値を追加
            if(x_map.containsKey(x_i)){
                x_map.replace(x_i,x_map.get(x_i) + 1);//x[k]に対する値が既に存在していれば1を足す
            }else{
                x_map.put(x_i,(long)1);//存在していなければ新たにMapに入れる
            }
        }
        System.out.println(count);
    }
}
