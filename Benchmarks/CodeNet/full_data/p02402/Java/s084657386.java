import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 1;
        int a;
        long Sum = 0;
        int Max = -1000000;
        int Min = 1000000;
        while (i <= n) {
            a = scan.nextInt();
            Sum += a;
            if (Max < a) {
                Max = a;

            }
            if (Min > a) {
                Min = a;
            }
            i++;
        }
        System.out.println(Min + " " + Max + " " + Sum);
    }
}
