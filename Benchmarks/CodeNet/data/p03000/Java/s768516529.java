import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int cont = 0;

        for (int i = 0; i < n; i++) {
            cont += sc.nextInt();
            if (cont > x) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}