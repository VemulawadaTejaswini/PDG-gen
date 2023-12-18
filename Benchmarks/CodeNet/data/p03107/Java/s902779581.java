import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        int count = 0;
        while (true) {
            if (S.length() == 0 || S.length() == 1) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            int beginIndex = -1;
            if (S.contains("10")) {
                beginIndex = S.indexOf("10");
            } else if (S.contains("01")) {
                beginIndex = S.indexOf("01");
            }
            if (beginIndex == -1) {
                break;
            }
            count += 2;
            if (beginIndex == 0) {
                sb.append(S.substring(2));
                S = sb.toString();
                continue;
            }
            if (beginIndex == 1) {
                sb.append(S.substring(0, 1));
                sb.append(S.substring(3));
                S = sb.toString();
                continue;
            }
            sb.append(S.substring(0, beginIndex - 1));
            sb.append(S.substring(beginIndex + 2));
            S = sb.toString();
        }

        System.out.println(count);
    }

}
