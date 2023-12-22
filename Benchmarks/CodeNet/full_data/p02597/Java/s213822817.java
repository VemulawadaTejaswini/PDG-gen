import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String c = sc.nextLine();

        int changeCount = 0;
        int rightPoint = n - 1;
        for (int i = 0; i < n; i++) {
            if (c.charAt(i) == 'W') {
                // System.out.println(c); // debug
                for (int j = rightPoint; j > i; j--) {
                    if (c.charAt(j) == 'R') {
                        // String left = (i == 0 ? "": c.substring(0, i));
                        // String right = (j == n - 1 ? "": c.substring(j + 1, n));
                        // c = left + "R" + c.substring(i + 1, j) + "W" + right;
                        changeCount++;
                        rightPoint = j - 1;
                        break;
                    }
                }
            }
        }
        System.out.print(changeCount);
    }
}
