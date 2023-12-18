import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int W = Integer.parseInt(abt[0]);
        int H = Integer.parseInt(abt[1]);
        int x = Integer.parseInt(abt[2]);
        int y = Integer.parseInt(abt[3]);

        long maxArea = W * H;

        long xL = (x) * H;
        long xR = (W - x) * H;

        long yT = (y) * W;
        long yU = (H - y) * W;

        long xMin = Math.min(xL, xR);
        long yMin = Math.min(yT, yU);

        long mostMax = Math.max(xMin, yMin);
        String multiWayDivede = xMin == yMin ? "1" : "0";

        if ((x == 0 && y == 0) || (x == W && y == H)) {
            // edge case
            mostMax = maxArea;
            multiWayDivede = "1";
        }

        System.out.println(mostMax + " " + multiWayDivede);
    }
}
