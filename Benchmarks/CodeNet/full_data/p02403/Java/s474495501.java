import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h == 0) {
                break;
            }
            write(h, w);
            System.out.println("");
        }

    }

    static void write(int h, int w) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

}
