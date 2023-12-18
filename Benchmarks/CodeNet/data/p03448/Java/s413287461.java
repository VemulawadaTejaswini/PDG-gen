import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());

        int res = 0;
        for (int i = 0; i <= a; i++) {
            for (int y = 0; y <= b; y++) {
                for (int z=0; z <= c; z++) {
                    int total = 500*i + 100*y + 50*z;
                    if (x == total)
                        res++;
                }
            }
        }
        System.out.print(res);

    }
}
