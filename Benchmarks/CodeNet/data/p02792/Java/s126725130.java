
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int ans = 0;
        for (int i = 1; a >= i; i++) {
            String iString = String.valueOf(i);

            String iStringPrefix = iString.substring(0, 1);
            int iPrefix = Integer.parseInt(iStringPrefix);

            String iStringSuffix = iString.substring(iString.length() - 1);
            int iSuffix = Integer.parseInt(iStringSuffix);

            //System.out.println(i + "/" + iPrefix + "/" + iSuffix);

            for (int j = 1; a >= j; j++) {
                String jString = String.valueOf(j);

                String jStringPrefix = jString.substring(0, 1);
                int jPrefix = Integer.parseInt(jStringPrefix);

                if (iSuffix == jPrefix) {
                    String jStringSuffix = jString.substring(jString.length() - 1);
                    int jSuffix = Integer.parseInt(jStringSuffix);

                    if (iPrefix == jSuffix) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}