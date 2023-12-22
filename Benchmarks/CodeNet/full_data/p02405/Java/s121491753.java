import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int H = sc.nextInt();
        int W = sc.nextInt();

        while (true) {
            if (H == 0 && W == 0) {
                break;
            } else {
                for (i = 0; i < H; i++) {
                    for (j = 0; j < W; j++) {
                        if (((i + j) % 2) == 0) System.out.print("#");
                        else System.out.print(".");
                    }
                    System.out.println();
                }
            }
        }
    }
}


