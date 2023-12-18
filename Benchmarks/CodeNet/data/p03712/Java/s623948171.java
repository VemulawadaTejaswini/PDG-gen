import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] a = new char[2][3];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().toCharArray();
        }
        for (int i = 0; i < h + 2; i++) {
            for (int j = 0; j < w + 2; j++) {
                if(i == 0 || i == h + 1 || j == 0 || j == w + 1) {
                    System.out.print("#");
                } else {
                    System.out.print(a[i - 1][j - 1]);
                }
            }
            System.out.println();
        }
    }
}