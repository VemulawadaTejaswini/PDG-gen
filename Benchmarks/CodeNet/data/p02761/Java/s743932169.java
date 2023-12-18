import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < m; i++) {
            sc.nextLine();
            num[sc.nextInt() - 1] = sc.nextInt();
        }
        if (num[0] == 0) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(num[i]);
            }
            System.out.println();
        }
    }
}
