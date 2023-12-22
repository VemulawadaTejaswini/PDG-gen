
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h[] = new int[2];
        int k[] = new int[2];
        int i;
        int f;
        int g;
        int z;
        int y;
        int gouH;
        int gouK;
        for (i = 0; i < 2; i++) {
            h[i] = scan.nextInt();
        }
        for (i = 0; i < 2; i++) {
            k[i] = scan.nextInt();
        }
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        i = 0;
        f = (h[i] * a) + ((h[i] / 10) * c);
        g = (k[i] * a) + ((k[i] / 10) * c);
        i = 1;
        z = (h[i] * b) + ((h[i] / 20) * d);
        y = (k[i] * b) + ((k[i] / 20) * d);

        gouH = f + z;
        gouK = g + y;

        if (gouH < gouK) {
            System.out.println("kenjiro");
        } else if (gouH > gouK) {
            System.out.println("hiroshi");
        } else if (gouH == gouK){
            System.out.println("even");
        }

    }

}

