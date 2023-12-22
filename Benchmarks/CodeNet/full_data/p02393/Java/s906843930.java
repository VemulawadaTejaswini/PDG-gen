import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        //入力準備
        Scanner sc = new Scanner(System.in);
        //配列の準備
        int[] arr = new int[3];
        
        //配列にデータを入れる
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
            //System.out.println(arr[i]);
        }
        
        //並び替え
        Arrays.sort(arr);
        
        //出力
        //for(int i = 0; i < arr.length; i++)
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}
