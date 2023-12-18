import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <= 3500 ; i++) {
            for (int j = 1 ; j <= 3500 ; j++) {
                if (4 * i * j - (long) n * (i + j) > 0 && n * i * j % (4 * i * j - n * (i + j)) == 0) {
                    System.out.println(i + " " + j + " " + (long) n * i * j / (4 * i * j - n * (i + j)));
                    return;
                }
            }
        }

        System.out.println("NG");



    }
}
