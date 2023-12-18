import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] an = new boolean[1000000000+1];

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

        /*
        a = 0;
        for (int i = 0; i < 1000000000+1; i++) {
            if (an[i]) {
                a += 1;
            }
        }
*/
        System.out.println(b);
    }

}