import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int count = 0;

        for (int i = 0; i < s.length - 2; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s[i]);
            for (int j = i + 1; j < s.length - 1; j++) {
                if (s[i] == s[j]) {
                    continue;
                }
                sb.append(s[j]);
                for (int k = j + 1; k < s.length; k++) {
                    if (j - i == k - j) {
                        break;
                    }
                    if (sb.indexOf(String.valueOf(s[k])) == -1) {
                        count += 1;
                    }
                }
                sb.deleteCharAt(1);
            }
        }
        System.out.println(count);
    }
}