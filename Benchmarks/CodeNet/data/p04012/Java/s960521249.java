import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            char[] s = sc.next().toCharArray();
            int cnt[] = new int[128];
            for (char ch : s) {
                cnt[ch]++;
            }
            boolean yes = true;
            for (int i = (int) 'a'; i <= (int) 'z'; i++) {
                if (cnt[i] % 2 != 0) {
                    yes = false;
                    break;
                }
            }
            System.out.println(yes ? "Yes" : "No");
        }
    }
}
