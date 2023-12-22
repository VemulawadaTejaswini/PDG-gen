
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
        int H = scan.nextInt();
        int C = scan.nextInt();
        int g;
        int b;
        int x;
        int t;
        int y;
        if (W > H) {
            t = W;
            y = H;
            while (W % H != 0) {
                g = W;
                W = H;
                H = g % H;
            }
            b = H * H;
            x = (t * y) / b;
            System.out.println(x * C);
        } else if (W < H) {
            t = W;
            y = H;
            while (H % W != 0) {
                g = H;
                H = W;
                W = g % W;

            }
            b = W * W;
            x = (t * y) / b;
            System.out.println(x * C);
        } else if (H == W) {
            System.out.println(C);
        }
    }
}

