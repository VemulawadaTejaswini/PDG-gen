import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w, h, x, y;
        w = sc.nextInt();
        h = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int b;
        if ((w/2==x) && (h/2==y)) b=0;
        else b = 1;
        System.out.println((double)w*h/2+" "+b);
    }
}