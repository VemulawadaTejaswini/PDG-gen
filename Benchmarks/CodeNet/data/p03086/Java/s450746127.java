import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
    
        int count = 0;  //文字数カウント
        int max = 0;    //最大文字数
        
        for (int i = 0; i < S.length(); ++i){
            if (S.charAt(i) == 'A' || S.charAt(i) == 'C' || S.charAt(i) == 'G' || S.charAt(i) == 'T'){    //該当するものがあった場合
                ++count;
                max = Math.max(count,max);  //大きい方を代入
            }
        }
        
        System.out.println(max);
        
    }
}