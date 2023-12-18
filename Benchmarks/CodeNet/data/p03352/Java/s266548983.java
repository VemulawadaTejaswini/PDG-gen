import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solove();
    }

    public void solove() {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 2; Math.pow(i, j) < x; j++) {
                result = Math.max((int) Math.pow(i, j), result);
            }
        }
        System.out.println(result);
    }
}
