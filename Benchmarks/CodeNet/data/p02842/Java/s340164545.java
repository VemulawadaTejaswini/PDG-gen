import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (Math.floor(i * 1.08) == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }

}
