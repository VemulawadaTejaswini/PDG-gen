import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] an = new boolean[100000000+1];

        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            an[a] = !an[a];
            if (an[a]) {
                b += 1;
            } else {
                b -= 1;
            }
        }

        System.out.println(b);
    }

}