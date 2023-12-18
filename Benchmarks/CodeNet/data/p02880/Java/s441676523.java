import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        int m2 = 1;
        int an;
        for (; m <= 9; ) {

            an = m * m2;
            if (n == an) {

                System.out.println("Yes");
                return;

            } else {
                m++;
                an = m * m2;
                if (n == an) {

                    System.out.println("Yes");
                    return;
                } else {
                    m2++;
                    an = m * m2;
                    if (n == an) {

                        System.out.println("Yes");
                        return;
                    }

                }


            }
        }
        System.out.println("No");

    }
}
