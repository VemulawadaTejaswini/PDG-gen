import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] a = new int[]{sc.nextInt(), sc.nextInt()};
            if (a[0] == 0 && a[1] == 0) {
                break;
            }
            for (int i = 0; i < a[1]; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < a[0]; j++) {
                    sb.append("#");
                }
                System.out.println(sb);
            }
        }
    }
}