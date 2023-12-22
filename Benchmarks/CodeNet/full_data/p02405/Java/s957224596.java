import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int binary = i % 2;
            i += 1;
            if (H == 0 && W == 0)
                break;
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if (x % 2 == binary) {
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
