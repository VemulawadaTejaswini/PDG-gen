import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int W = scanner.nextInt();
        int H = scanner.nextInt();

        int x = scanner.nextInt();
        int y = scanner.nextInt();


        double area1 = Math.min(x * H, (W-x) * H);
        double area2 = Math.min(W * y, W * (H - y));

        double area = Math.max(area1, area2);

        if(2*x == W && 2*y == H){
            System.out.println(area + " " + 1);
        }else{
            System.out.println(area + " " + 0);
        }
    }
}
