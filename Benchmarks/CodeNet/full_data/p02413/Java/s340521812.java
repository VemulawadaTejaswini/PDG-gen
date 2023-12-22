import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int retu = scanner.nextInt();
        int gyou = scanner.nextInt();
        int[][] shuturyoku = new int[(retu + 1)][(gyou + 1)];

        for (int i = 1; retu >= i; i++) {
            for (int j = 1; gyou >= j; j++) {
                int a = scanner.nextInt();
                shuturyoku[i - 1][j - 1] = a;
            }
        }
        for (int i = 1; retu >= i; i++) {
            for (int j = 1; gyou >= j; j++) {
                shuturyoku[i - 1][gyou] += shuturyoku[i - 1][j - 1];
            }
        }
        for (int i = 1; retu >= i; i++) {
            for (int j = 1; gyou >= j; j++) {
                shuturyoku[retu][j - 1] += shuturyoku[i - 1][j - 1];
            }
        }
        for (int i = 1; retu >= i; i++) {
            shuturyoku[retu][gyou] += shuturyoku[i-1][gyou];
        }
        for (int i = 1; retu + 1 >= i; i++) {
            for (int j = 1; gyou + 1 >= j; j++) {
                if (j != gyou+1) {
                    System.out.print(shuturyoku[i - 1][j - 1] + " ");
                } else {
                    System.out.println(shuturyoku[i - 1][j - 1]);
                }
            }
        }
    }
}