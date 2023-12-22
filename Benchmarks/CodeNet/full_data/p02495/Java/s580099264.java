import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int i, j;
        for (;;) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H == 0 && W == 0) break;
            for (i = 0; i < H; i++) {
                for (j = 0; j < W; j++) {
                    if ((i + j) % 2 == 0) System.out.printf("%s", "#");
                    else System.out.printf("%s", ".");
                }
                System.out.printf("\n");
            }
        }
    }
}