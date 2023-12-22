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

                                System.out.println(x + " " + y);
                        }
                }
        }
}