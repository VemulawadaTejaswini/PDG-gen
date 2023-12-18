import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
      	if (n == 1 && a== b) {
          System.out.println(1);
          return;
        }
        if (n < 2 || a > b) {
            System.out.println(0);
            return;
        }
        System.out.println((n - 2) * (b - a) + 1);
    }

}