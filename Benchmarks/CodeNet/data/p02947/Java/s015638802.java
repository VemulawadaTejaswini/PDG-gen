
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        /*
         * for i j文で全てのパターンを精査するのは追いつかない
         *
         */
        Scanner s = new Scanner(System.in);
        long n = Integer.parseInt(s.nextLine());
        String[] in = new String[(int)n];
        for(int i = 0;i < n;i++){
            in[i] = s.nextLine();

        }
        long r = 0;
        List<Long> checked = new ArrayList<Long>();
        for(long i = 0;i < n;i++){
            for(long j = 0;j < n; j++){
                if(i == j){
                    continue;
                }
                if(checked.contains(j)){
                    continue;
                }
                String s1 = in[(int)i];
                String s2 = in[(int)j];
                char[] ch1 = s1.toCharArray();
                char[] ch2 = s2.toCharArray();
                Arrays.sort(ch1);
                Arrays.sort(ch2);
                if (Arrays.equals(ch1, ch2)) {
                    checked.add(i);
                    r++;
                }
            }
        }
        System.out.println(r);
    }
}