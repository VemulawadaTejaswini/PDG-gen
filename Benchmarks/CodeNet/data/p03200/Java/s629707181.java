public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        char[] s = scanner.next().toCharArray();
        int count = 0, ans = 0;
        for (int i = s.length - 1; i >= 0; i--)
            if (s[i] == 'W') count++;
            else ans += count;

        System.out.println(ans);
    }
}
