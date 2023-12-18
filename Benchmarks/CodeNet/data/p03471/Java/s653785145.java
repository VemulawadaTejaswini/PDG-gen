import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int ans = 0;

        Integer n = sc.nextInt();
        Integer y = sc.nextInt();

        for (int i = 0; i <= 2000; i++) {
            for (int j = 0; j <= 2000 - i; j++) {
                int k = 2000 - i - j;
                if (y == i * 10000 + j * 5000 + k * 1000) {
                    System.out.println("" + i + " " + j + " " + k);
                    sc.close();
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
        sc.close();
    }
}