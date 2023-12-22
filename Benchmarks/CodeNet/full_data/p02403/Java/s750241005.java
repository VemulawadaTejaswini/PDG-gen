import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H = input.nextInt();
        int W = input.nextInt();
        
        while (H != 0 && W != 0) {
            for (int i = 0; i < H; i ++) {
                for (int j = 0; j < W; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
            
            H = input.nextInt();
            W = input.nextInt();
        }
    }
}
