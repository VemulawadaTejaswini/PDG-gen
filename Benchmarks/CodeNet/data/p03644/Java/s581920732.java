import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int maxN = 0;

        for (int i = 0; i <= N; i++) {

            int n = 0;

            while (i % 2 == 0) {
                i = i / 2;
                n++;
            }

            if (n > maxN)
                maxN = n;
        }

        System.out.println(maxN);

    }


}
