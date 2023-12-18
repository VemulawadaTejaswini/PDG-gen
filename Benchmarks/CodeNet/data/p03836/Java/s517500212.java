import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sx = in.nextInt();
        int sy = in.nextInt();
        int tx = in.nextInt();
        int ty = in.nextInt();

        int dx = Math.abs(tx - sx);
        int dy = Math.abs(ty - sy);

        System.out.print(repeat('U', dy));
        System.out.print(repeat('R', dx));

        System.out.print(repeat('D', dy));
        System.out.print(repeat('L', dx));

        System.out.print('L');
        System.out.print(repeat('U', dy + 1));
        System.out.print(repeat('R', dx + 1));
        System.out.print('D');

        System.out.print('R');
        System.out.print(repeat('D', dy + 1));
        System.out.print(repeat('L', dx + 1));
        System.out.print('U');
    }
//UUURRRDDDLLLLUUUURRRRDRDDDDLLLLU
//UURRURRDDDLLDLLULUUURRURRDDDLLDL
    private static String repeat(char c, int times) {
        char[] repeat = new char[times];
        Arrays.fill(repeat, c);
        return new String(repeat);
    }
}
