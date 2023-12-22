import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine());
            System.out.println(isAble(stringTokenizer) ? "yes" : "no");
        }
    }

    static boolean isAble(StringTokenizer stringTokenizer) {
        int leftTop = Integer.parseInt(stringTokenizer.nextToken());
        int rightTop = 0;
        for (int j = 1; j < 10; j++) {
            int ballNumber = Integer.parseInt(stringTokenizer.nextToken());
            if (ballNumber < leftTop) {
                leftTop = ballNumber;
            } else if (ballNumber < rightTop) {
                rightTop = ballNumber;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
