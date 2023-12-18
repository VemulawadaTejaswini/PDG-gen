public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        char[] s = scanner.next().toCharArray();
        int c1 = 0, c2 = 0;
        for (char c : s) {
            if (c == '0') c1++;
            else c2++;
        }

        System.out.println(Math.min(c1, c2) * 2);
    }
}