import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        for(i = 0; ; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H == 0 || W == 0) break;
            for(j = 0; j < H; j++) {
                for(k = 0; k < W; k++) {
                    System.out.print("#");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
