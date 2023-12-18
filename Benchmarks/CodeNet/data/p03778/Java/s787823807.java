import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int aa = Math.min(a, b);
        int bb = Math.max(a, b);

        int i = bb - (aa + w);
        if (i < 0) {
            System.out.println(0);
        } else {
            System.out.println(i);
        }
    }
}
