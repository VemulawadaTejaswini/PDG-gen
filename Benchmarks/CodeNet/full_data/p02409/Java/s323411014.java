import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][][] members = new int[4][3][10];
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt();
            int f = scanner.nextInt();
            int r = scanner.nextInt();
            int v = scanner.nextInt();

            members[b-1][f-1][r-1] += v;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(" ");
                    System.out.print(members[i][j][k]);
                }
                System.out.print("\n");
            }
            System.out.println("####################");
        }

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.print(" ");
                System.out.print(members[3][j][k]);
            }
            System.out.print("\n");
        }

        scanner.close();
    }
}

