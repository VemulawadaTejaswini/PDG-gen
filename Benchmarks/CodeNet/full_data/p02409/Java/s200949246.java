import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][][] list = new int[4][3][10];
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt() - 1;
            int c = scanner.nextInt() - 1;
            int d = scanner.nextInt() - 1;
            int e = scanner.nextInt();
            list[b][c][d] += e;
        }
 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(" " + list[i][j][k]);
                }
                System.out.println();
            }
            if (i != 3)
                System.out.println("####################");
        }
 
    }
}
