import java.util.Scanner;

public class Main {

    private static int sum(int g, int l) {
        return g * (g + 1) / 2 + l * (l - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int j = 0;
        int ans = 0;
        for (int k = 0; k < s.length(); k++) {
            if ('>' == s.charAt(k)) {
                j++;
                continue;
            }
            if (j == 0) {
                i++;
                continue;
            }
            ans += sum(Math.max(i, j), Math.min(i, j));
            i = 1;
            j = 0;
        }
        ans += sum(Math.max(i, j), Math.min(i, j));
        System.out.println(ans);
    }

}
