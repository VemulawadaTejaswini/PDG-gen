import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double sin = y2 >= y1 ? (y2 - y1) / d : (y1 - y2) / d;
        double cos = y2 >= y1 ? (x2 - x1) / d : (x1 - x2) / d;

        double x1r = 0;
        double y1r = 0;
        double x2r = y2 >= y1 ? cos * (x2 - x1) + sin * (y2 - y1) : cos * (x1 - x2) + sin * (y1 - y2);
        double y2r = y2 >= y1 ? -sin * (x2 - x1) + cos * (y2 - y1) : -sin * (x1 - x2) + cos * (y1 - y2);

        double x3r = x2r;
        double y3r = y2r + d;
        double x4r = 0;
        double y4r = d;

        int x3 = y2 >= y1 ? (int) (cos * x3r - sin * y3r) + x1 : (int) -(cos * x3r - sin * y3r) + x1;
        int y3 = y2 >= y1 ? (int) (sin * x3r + cos * y3r) + y1 : (int) -(sin * x3r + cos * y3r) + y1;
        int x4 = y2 >= y1 ? (int) (cos * x4r - sin * y4r) + x1 : (int) -(cos * x4r - sin * y4r) + x1;
        int y4 = y2 >= y1 ? (int) (sin * x4r + cos * y4r) + y1 : (int) -(sin * x4r + cos * y4r) + y1;

        System.out.printf("%d %d %d %d", x3, y3, x4, y4);
    }
}