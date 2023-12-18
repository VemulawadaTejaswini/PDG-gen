import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        final List<Route> routes = new ArrayList<>();

        for(int i = 0; i < 3 ; i++) {
            final int a = sc.nextInt();
            final int b = sc.nextInt();
            routes.add(new Route(a, b));
        }
        Collections.sort(routes);
    
        boolean[] record = {false, false, false, false};

        int endpoint = routes.get(0).getA();

        while(0 < routes.size()) {
            for(int i = 0; i < routes.size() ; i++) {
                final Route route = routes.get(i);
                if (route.getA() == endpoint) {
                    record[route.getA() - 1] = true;
                    record[route.getB() - 1] = true;
                    endpoint = route.getB();
                    routes.remove(i);
                    break;
                } else if (route.getB() == endpoint) {
                    record[route.getA() - 1] = true;
                    record[route.getB() - 1] = true;
                    endpoint = route.getA();
                    routes.remove(i);
                    break;
                }
                if (routes.size() -1 == i ) {
                    System.out.println("NO");
                    return;
                }
            }
        }
    
        for(boolean b : record) {
            if(!b) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        
    }
    
    static class Route implements Comparable<Route> {
        private int a;
        private int b;
        
        public Route(final int a, final int b) {
            this.a = a < b ? a : b;
            this.b = (a + b) - this.a;
        }
        
        int getA() {
            return this.a;
        }
    
        int getB() {
            return this.b;
        }

        @Override
        public int compareTo(Route otherRoute) {
            return (this.getA() - otherRoute.getA());
        }
    }
}
