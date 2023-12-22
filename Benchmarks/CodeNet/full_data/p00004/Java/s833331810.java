import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        while (sc.hasNext()) {
            calc();
        }
    }
    
    public static void calc() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        // x?????????????§£???
        int k = Math.abs(b)*Math.abs(e)/gcd(Math.abs(b), Math.abs(e));
        int ax = (k/Math.abs(b)) * a;
        int cx = (k/Math.abs(b)) * c;
        int dx = (k/Math.abs(e)) * d;
        int fx = (k/Math.abs(e)) * f;
        float x;
        if (b*e >= 0) {
            x = (cx-fx)/(ax-dx);
        } else {
            x = (cx+fx)/(ax+dx);
        }
        
        // y?????????????§£???
        k = Math.abs(a)*Math.abs(d)/gcd(Math.abs(a), Math.abs(d));
        int by = (k/Math.abs(a)) * b;
        int cy = (k/Math.abs(a)) * c;
        int ey = (k/Math.abs(d)) * e;
        int fy = (k/Math.abs(d)) * f;
        float y;
        if (a*d >= 0) {
            y = (cy-fy)/(by-ey);
        } else {
            y = (cy+fy)/(by+ey);
        }
        
        System.out.println(x + " " + y);
    }

    public static int gcd(int a, int b) {
        if (a == b) return a;
        if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }
}