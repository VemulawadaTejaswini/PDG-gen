import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int mae = Integer.parseInt(s.substring(0, 2));
        int ushiro = Integer.parseInt(s.substring(2, 4));

        boolean maeIsMM = false;
        boolean ushiroIsMM = false;

        if (mae > 0 && mae < 13) {
            maeIsMM = true;
        }
        if (ushiro > 0 && ushiro < 13) {
            ushiroIsMM = true;
        }


        String ans = "";

        if (maeIsMM && ushiroIsMM) {
            ans = "AMBIGUOUS";
        } else if (maeIsMM) {
            ans = "MMYY";
        } else if (ushiroIsMM) {
            ans = "YYMM";
        } else {
            ans = "NA";
        }

        // 出力
        System.out.println(ans);
    }
}
