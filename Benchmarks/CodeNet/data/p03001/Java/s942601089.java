import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        
        System.out.print((double)(w * h) / 2);

        if (x * 2 == w && y * 2 == h) {
            System.out.println(" 1");
        } else {
            System.out.println(" 0");
        }
    }
}
