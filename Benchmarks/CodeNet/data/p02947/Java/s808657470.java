
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        long n = Integer.parseInt(s.nextLine());
        String[] in = new String[(int)n];
        for(int i = 0;i < n;i++){
            in[i] = s.nextLine();
        }
        go(in, n);
    }
    private static boolean isAnagram(String str1, String str2) {
        int[] count = new int[256];
        int i;
        for (i = 0; i < str1.length() && i < str2.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (i = 0; i < 256; i++)
            if (count[i] != 0)
                return false;
        return true;
    }
    private static void go(String in[], long n) {
        long r = 0;
        for (long i = 0; i < n; i++) {
            for (long j = i + 1; j < n; j++) {
                if (isAnagram(in[(int)i], in[(int)j])) {
                    r++;
                }
            }
        }
        System.out.println(r);
    }
}