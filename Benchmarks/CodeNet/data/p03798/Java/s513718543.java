import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        char[] ans = new char[s.length];
        if (isCorrect('S', 'S', ans, s)) {
            System.out.println(String.valueOf(ans));
            return;
        }
        if (isCorrect('S', 'W', ans, s)) {
            System.out.println(String.valueOf(ans));
            return;
        }
        if (isCorrect('W', 'S', ans, s)) {
            System.out.println(String.valueOf(ans));
            return;
        }
        if (isCorrect('W', 'W', ans, s)) {
            System.out.println(String.valueOf(ans));
            return;
        }
        System.out.println(-1);
    }

    private static boolean isCorrect(char c1, char c2, char[] ans, char[] s) {
        ans[0] = c1;
        ans[1] = c2;
        for (int i = 1; i < s.length; i++) {
            if (i == s.length - 1) {
                if (ans[i] == 'S') {
                    if (s[i] == 'o' && ans[i - 1] == 'S') {
                        ans[0] = 'S';
                    } else if (s[i] == 'o' && ans[i - 1] == 'W') {
                        ans[0] = 'W';
                    } else if (s[i] == 'x' && ans[i - 1] == 'S') {
                        ans[0] = 'W';
                    } else if (s[i] == 'x' && ans[i - 1] == 'W') {
                        ans[0] = 'S';
                    }
                } else if (ans[i] == 'W') {
                    if (s[i] == 'o' && ans[i - 1] == 'S') {
                        ans[0] = 'W';
                    } else if (s[i] == 'o' && ans[i - 1] == 'W') {
                        ans[0] = 'S';
                    } else if (s[i] == 'x' && ans[i - 1] == 'S') {
                        ans[0] = 'S';
                    } else if (s[i] == 'x' && ans[i - 1] == 'W') {
                        ans[0] = 'W';
                    }
                }
            } else if (ans[i] == 'S') {
                if (s[i] == 'o' && ans[i - 1] == 'S') {
                    ans[i + 1] = 'S';
                } else if (s[i] == 'o' && ans[i - 1] == 'W') {
                    ans[i + 1] = 'W';
                } else if (s[i] == 'x' && ans[i - 1] == 'S') {
                    ans[i + 1] = 'W';
                } else if (s[i] == 'x' && ans[i - 1] == 'W') {
                    ans[i + 1] = 'S';
                }
            } else if (ans[i] == 'W') {
                if (s[i] == 'o' && ans[i - 1] == 'S') {
                    ans[i + 1] = 'W';
                } else if (s[i] == 'o' && ans[i - 1] == 'W') {
                    ans[i + 1] = 'S';
                } else if (s[i] == 'x' && ans[i - 1] == 'S') {
                    ans[i + 1] = 'S';
                } else if (s[i] == 'x' && ans[i - 1] == 'W') {
                    ans[i + 1] = 'W';
                }
            }
        }
        return ans[0] == c1;
    }
}