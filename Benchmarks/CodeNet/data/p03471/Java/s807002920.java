import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // 定数
        final int ONE_THOUSAND = 1000;
        final String RESULT_ERROR = "-1 -1 -1";

        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner("10 55000");
        
        // お札の枚数
        int bills = sc.nextInt();
        // 合計金額
        int sum = sc.nextInt();
        
        // 出力結果の初期化
        String result = null;
        
        // 合計÷1000円
        int billsOnlyThousand = sum / ONE_THOUSAND;
        
        if(billsOnlyThousand < bills) {
            // 合計÷1000円がお札の枚数より少ない場合は
            // 組み合わせが存在しない
            result = RESULT_ERROR;
        } else {
            // 合計÷1000円がお札の枚数より多い場合は
            // 組み合わせが存在する
            result = "0 0 " + String.valueOf(billsOnlyThousand);
        }
        
        System.out.println(result);
        
    }
}
