import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        for (int i = 0; i < H; i++) {
            String line = sc.next();
            int x = -1;
            for (int j = 1; j < W; j++) {
                if (line.charAt(j) == 'c') {
                    x = 0;
                } else {
                    if (x >= 0) x += 1;
                }
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(x);
            }
            System.out.println();
        }
    }
}