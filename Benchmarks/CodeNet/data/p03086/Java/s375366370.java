import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();

        int max = 0;
        int cnt = 0;
        for (int i = 0; i < s.length; i++) {
            if (check(s[i])) {
                cnt++;
                max = Math.max(cnt, max);
            } else {
                max = Math.max(cnt, max);
                cnt = 0;
            }
        }
        
        System.out.println(max);
    }

    static boolean check(char c) {
        switch (c) {
            case 'A':
            case 'C':
            case 'G':
            case 'T': return true;
            default: return false;
        }
    }
}
