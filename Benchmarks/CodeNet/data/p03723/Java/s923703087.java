import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        try (
            Scanner sc = new Scanner(System.in);
        ) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();

            if (a == b && b == c) {
                System.out.println(-1);
            } else {
                int count = 0;
                while ((a % 2 == 0 && b % 2 == 0 && c % 2 == 0) && !(a == b && b == c)) {
                    count += 1;
                    long newA = (b / 2) + (c / 2);
                    long newB = (c / 2) + (a / 2);
                    long newC = (a / 2) + (b / 2);
                    a = newA;
                    b = newB;
                    c = newC;
                }
                System.out.println(count);
            }
        }
    }

}
