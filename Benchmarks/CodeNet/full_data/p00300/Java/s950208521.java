import java.util.Scanner;

//0305
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int r = sc.nextInt();
            int t = sc.nextInt();
            boolean fr = r % 100 == 0;
            boolean ft = t % 30 == 0;
            int a = r / 100 + t / 30 * 5;
            System.out.print(a);
            if (fr && ft) {
                System.out.println();
            } else if (fr) {
                System.out.println(" " + (a + 5));
            } else if (ft) {
                System.out.println(" " + (a + 1));
            } else {
                System.out.println(" " + (a + 1) + " " + (a + 5) + " " + (a + 6));
            }
        }

    }
}
