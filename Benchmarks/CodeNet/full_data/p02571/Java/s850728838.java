import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int length = t.length();
        int sabun = s.length() - t.length();

        for (int i = 0; i <= t.length(); i++) {
            for (int j = i; j <= t.length(); j++) {
                if (s.substring(i, j + sabun).contains(t.substring(i, j))) {
                    System.out.println(t.substring(i, j));
                    length = length > i + t.length() - j ? i + t.length() - j : length;
                }
            }
        }
        System.out.println(length);
    }
}