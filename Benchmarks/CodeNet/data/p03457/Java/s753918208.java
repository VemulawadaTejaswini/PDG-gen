import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int nowX = 0;
        int nowY = 0;
        int nowT = 0;

        boolean isCan = false;

        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split(" ");
            int t = Integer.parseInt(line[0]);
            int x = Integer.parseInt(line[1]);
            int y = Integer.parseInt(line[2]);

            int dt = t - nowT;
            int dxy = Math.abs(x - nowX) + Math.abs(y - nowY);
            if (dt >= dxy && ((dt - dxy) % 2 == 0 || dt - dxy == 0)) {
                isCan = true;
                nowT = t;
                nowX = x;
                nowY = y;
            } else {
                isCan = false;
                break;
            }
        }

        if (isCan) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}