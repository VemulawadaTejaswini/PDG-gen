import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] xs = {
                -1,
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt()
        };
        for (int i = 1; i < xs.length; i++) {
            if (xs[i] == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}