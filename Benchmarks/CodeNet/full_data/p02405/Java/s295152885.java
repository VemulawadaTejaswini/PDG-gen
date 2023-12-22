import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        while(H!=0 && W!=0) {
            H = sc.nextInt();
            W = sc.nextInt();
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (((i + j) % 2) == 0) System.out.printf("#");
                    else System.out.printf(".");
                }
                System.out.println();
            }
        }
    }
}
