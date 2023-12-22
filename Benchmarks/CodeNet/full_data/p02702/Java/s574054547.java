
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        String stringJb = null;
        Long intJb;
        int ans = 0;

        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 4; j < S.length() + 1; j++) {
                stringJb = S.substring(i,j);
                intJb = Long.parseLong(stringJb);
                if (intJb % 2019 == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

}
