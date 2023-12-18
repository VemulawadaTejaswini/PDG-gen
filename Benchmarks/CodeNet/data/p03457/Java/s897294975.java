import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastT = 0;
        int lastX = 0;
        int lastY = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int diffT = t - lastT;
            int distance = Math.abs(x - lastX) + Math.abs(y - lastY);
            if (distance > diffT || diffT % 2 != distance % 2) {
                System.out.println("No");
                return;
            }

            lastT = t;
            lastX = x;
            lastY = y;
        }

        System.out.println("Yes");
    }
}
