import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        while (sc.hasNext()) {
                                double a = sc.nextDouble(),
                                           b = sc.nextDouble(),
                                           c = sc.nextDouble(),
                                           d = sc.nextDouble(),
                                           e = sc.nextDouble(),
                                           f = sc.nextDouble();
                                double x = (c-f*b/e)/(a-b*d/e);
                                double y = (c-a*x)/b;

                                x *= 1000;
                                x += (x) / Math.abs(x) * 0.5;
                                x = (long)x;
                                x /= 1000;
                                y *= 1000;
                                y += (y) / Math.abs(y) * 0.5;
                                y = (long)y;
                                y /= 1000;
                                System.out.println(x + " " + y);
                        }
                }
        }
}