import java.util.Scanner;

public class Main {

    static final String ZERO = "0";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str;
        for (int i = 1; sc.hasNext(); i++) {
            str = sc.nextLine();
            if (ZERO.equals(str)) {
                break;
            }
            sb.append("Case " + i + ": " + str + "\n");
        }

        System.out.print(sb);
    }
}