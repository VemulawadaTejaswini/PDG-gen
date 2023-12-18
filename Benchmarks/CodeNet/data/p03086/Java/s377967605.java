import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        sc.close();

        int max = 0;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'G' || s.charAt(i) == 'C' || s.charAt(i) == 'T') {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }

        System.out.println(max);

    }
}