public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.next();
        int ans = 0, combo = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("ACGT".contains(String.valueOf(s.charAt(i)))) {
                combo++;
            } else {
                ans = Math.max(ans, combo);
            }
        }
        System.out.println(ans);
    }
}