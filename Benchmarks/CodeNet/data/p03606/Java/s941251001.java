import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] lr = new int[n][2];
        for (int i = 0; i < n; i++) {
            lr[i][0] = sc.nextInt();
            lr[i][1] = sc.nextInt();
        }

        int pep = 0;
        for (int i = 0; i < n; i++) {
            pep += lr[i][1] - lr[i][0] + 1;
        }

        System.out.println(pep);
    }

}