import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        String line = readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        Integer n = Integer.parseInt(st.nextToken());	/* 胃袋耐久期間 */
//        Integer a = Integer.parseInt(st.nextToken());	/* 賞味期限期間 */
//        Integer b = Integer.parseInt(st.nextToken());	/* 購入してから食べた日まで */

        /* 賞味期限までに食べた場合 */
        if ( n > 999) {
        	System.out.println("ABD");

        /* 胃袋耐久期間中に食べた場合 */
//        }else if ( (a + x) >= b) {
//        	System.out.println("safe");

        /* 胃袋耐久期間を超えて食べた場合 */
        }else {
        	System.out.println("ABC");
        }

    }

    private static String readLine() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
