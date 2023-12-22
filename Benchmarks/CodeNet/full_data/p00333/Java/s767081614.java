
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
        if (W > H) {
            while (W % H == 0) {
                g = W;
                W = H;
                H = g % H;

            }
            b = H * H;
            x = (H * W) / b;
            System.out.println(x * C);
        } else if (W < H) {
            while (H % W == 0) {
                g = H;
                H = W;
                W = g % W;

            }
            b = W * W;
            x = (H * W) / b;
            System.out.println(x * C);
        } else if (H == W) {
            System.out.println(C);
        }
    }
}

