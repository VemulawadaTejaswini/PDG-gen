import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int g = sc.nextInt();
            if (g == 0) {
                break;
            }
            int n=sc.nextInt();
            while(n-->0) {
                g+=sc.nextInt()-sc.nextInt();
            }
            System.out.println(g<=0?"OK":g);
        }
    }
}
