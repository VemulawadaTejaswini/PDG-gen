import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 10000000;
        for (int i = 0 ; i < s.length() - 2; i++) {
            String b = s.substring(i, i + 3);
            int c = Integer.valueOf(b);
            ans = Math.min(ans, Math.abs(c - 753));
        }

        System.out.println(ans);
    }

}