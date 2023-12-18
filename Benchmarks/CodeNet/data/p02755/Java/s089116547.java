import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            final int A  = sc.nextInt();
            final int B  = sc.nextInt();

            for (int i=0; i<=1000; i++) {
                int eight = (int)Math.floor((double)i * 0.08);
                int ten = (int)Math.floor((double)i * 0.10);
                if (eight == A && ten == B) {
                    System.out.println(i);
                    return;
                }
            }

            System.out.println("-1");

        } finally {
            sc.close();
        }
    }
}
