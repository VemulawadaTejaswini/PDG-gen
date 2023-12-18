
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] in = sc.nextLine().split(" ");
        List<Integer> ints = new ArrayList<Integer>();
        for(String str : in){
            ints.add(Integer.parseInt(str));
        }
        Collections.sort(ints);
        long r = 0;
        for(int ia = 0;ia < n;ia++){
            int a = ints.get(ia);
            for(int ib = ia + 1;ib < n;ib++) {
                int b = ints.get(ib);
                //検索開始位置
                int start = ib;
                //検索終了位置
                int end = ints.size();
                //目的の値 (これより小さい値を探す)
                int val = a + b ;
                while (end - start > 1) {
                    int mid = start + (end - start) / 2;
                    if (ints.get(mid) < val) {
                        start = mid;
                    } else {
                        end = mid;
                    }
                }
                int add = (end-1) -ib;
                r += add;
            }
        }
        System.out.println(r);
    }
}