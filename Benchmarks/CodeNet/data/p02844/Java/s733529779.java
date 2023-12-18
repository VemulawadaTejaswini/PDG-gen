import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int ans = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(j);
                    sb.append(k);
                    String num = sb.toString();
                    int m = 0;
                    for (int l = 0; l < n; l++) {
                        if (s.charAt(l) == num.charAt(m)) {
                            m++;
                        }
                        if (m >= 3) {
                            ans++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

}
