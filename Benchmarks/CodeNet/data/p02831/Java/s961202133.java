import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int judge = 0;

        for (int i = 1; i <= B; i++) {
            judge = A * i;
            if (B % judge == 0) {
                break;
            }
        }

        System.out.println(judge);
    }

}