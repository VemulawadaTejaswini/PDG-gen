
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String currentChars = s;
        long r = s.length();
        for(char c : t.toCharArray()){
            if(!s.contains(String.valueOf(c))){
                System.out.println(-1);
                System.exit(0);
            }
            if(currentChars.indexOf(c) == -1){
                currentChars += s;
                r += s.length();
                currentChars = currentChars.substring(currentChars.indexOf(c)+1,currentChars.length());
            }else{
                currentChars = currentChars.substring(currentChars.indexOf(c)+1,currentChars.length());
            }
        }
        r -= currentChars.length();
        System.out.println(r);
    }
}