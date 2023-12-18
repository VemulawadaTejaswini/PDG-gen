import java.util.Scanner;

public class Main {

    private static final String[] KEYENCE = "keyence".split("");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");

        int matchedLength = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(KEYENCE[matchedLength])) {
                matchedLength++;
                if (matchedLength == KEYENCE.length) {
                    System.out.println("YES");
                    return;
                }
                continue;
            }
        }
        System.out.println("NO");
    }

}
