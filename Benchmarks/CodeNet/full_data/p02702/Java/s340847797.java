import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int ans = 0;
        for (int i=0;i<=(s.length()-4);i++) {
            for (int j=(i+4);j<=(s.length());j++) {
                String ssub = s.substring(i, j);
                long l = Long.parseLong(ssub);
                if (l%2019 == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
