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
        
        for(int i = n; 1 <= i; i--){
            int A_i = sc.nextInt();//読み込み
            int y_i = i + A_i;//y_iに対応するx_iが存在した時、その個数を足しあげ
            if(x_map.containsKey(y_i)){
                count += x_map.get(y_i);
            }
            
            int x_i = i - A_i;//足しあげ時点でmapにはiより大きいkでのX[k]しか存在しないようにするため、毎回この時点で値を追加
            if(x_map.containsKey(x_i)){
                x_map.replace(x_i,x_map.get(x_i) + 1);//x[k]に対する値が既に存在していれば1を足す
            }else{
                x_map.put(x_i,1);//存在していなければ新たにMapに入れる
            }
        }
        
        System.out.println(count);

    }
}
