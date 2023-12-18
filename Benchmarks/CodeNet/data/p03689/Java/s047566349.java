import java.util.Scanner;
public class main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt(), h = sc.nextInt(), w = sc.nextInt();
        if (H%h == 0 && W%w == 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
            for (int i = 0; i < H; ++i) {
                for (int j = 0; j < W; ++j) {
                    System.out.print(i%h == h-1 && j%w == w-1 ? -4000*h*w+3999 : 4000);
                    System.out.print(' ');
                }
                System.out.println();
            }
        }
	}
}