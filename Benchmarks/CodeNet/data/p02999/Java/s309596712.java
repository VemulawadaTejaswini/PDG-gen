import java.util.*;
public class Main {

    public static float calc_s(int w, int h)
    {
        return (float)w*(float)h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w, h, x, y;
        w = sc.nextInt();
        h = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        Boolean b;
        b = (w/2==x) && (h/2==y);
        System.out.println(calc_s(w,h)/2+" "+b);
    }
}