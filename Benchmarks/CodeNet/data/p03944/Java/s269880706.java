import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int c;
        Point dl = new Point();
        dl.x = 0;
        dl.y = 0;
        Point ur = new Point();
        ur.x = a;
        ur.y = b;

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            switch (c) {
                case 1: dl.x = a; break;
                case 2: ur.x = a; break;
                case 3: dl.y = b; break;
                case 4: ur.y = b; break;
            }
        }
        int res = (ur.x - dl.x) * (ur.y - dl.y);
        System.out.println(res > 0 ? res : 0);
    }

    static private class Point {
        int x,y;

        Point() {}
    }
}
