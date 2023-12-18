import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        //英字をカウントするための配列を準備
        int[] alphabet = new int[26];

        for(int i = 0; i < w.length(); i++){
            //char型(実体は整数値)を用いて、英字をカウント
            alphabet[w.charAt(i) - 'a']++;
        }
        
        //配列の要素がすべて偶数であるかチェック
        boolean beauty = true;
        for(int i = 0; i < 26; i++){
            if(alphabet[i] % 2 != 0)beauty = false;
        }
        
        //三項演算子で評価
        System.out.println(beauty? "Yes" : "No");
    }
}
