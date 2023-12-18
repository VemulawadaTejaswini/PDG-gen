import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        boolean successFlag = false;
        boolean loopFlag = true;
        String str = "";
        String str_tmp = "";
        String S = sc.next();
        String[] divide = {"dream", "dreamer", "erase", "eraser"};
        
        // 試験対象の文字列を反転させ、前方一致判定の誤りを防ぐ
        StringBuffer sb = new StringBuffer(S);
		S = sb.reverse().toString();
		for (int i = 0; i < 4; i++) {
		    sb = new StringBuffer(divide[i]);
		    divide[i] = sb.reverse().toString();
		}
        
        while (true){
            for (int i = 0; i < 4; i++){
                
                // 一時変数に1文節追加
                str_tmp += divide[i];
            
                // 前方一致するか判定
                if (S.startsWith(str_tmp)) {
                    // 前方一致する場合
                    // 入力と完全一致するか判定
                    if (S.equals(str_tmp)){
                        // 完全一致する場合処理終了
                        successFlag = true;
                    } else {
                        // 完全一致しない場合、strに一時変数を代入して処理続行
                        str = str_tmp;
                    }
                    break;
                } else {
                    // 前方一致しない場合一時変数にstrを代入して切り戻し
                    str_tmp = str;
                }
                // 全ループしても前方一致しない場合
                if ( i >= 3 ) loopFlag = false;
            }
            if ( successFlag || !loopFlag ) break;
        }
        
        if (successFlag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
