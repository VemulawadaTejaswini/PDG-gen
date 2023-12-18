import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numT = in.nextInt();
        int decrement = numT;
        int increment = 3;
        if(numT >= 2 && numT <= 8) {
            Loc[] towns = new Loc[numT];
            while(decrement > 0) {

                String location = in.nextLine();
                towns[numT - decrement] = genLoc(location);

                decrement--;
            }

            double[] lengths = new double[fact(numT)];
            ArrayList<String> orders = new ArrayList<>();
            orders.add("12");
            orders.add("21");

            while(increment <= numT) {
                ArrayList<String> newOrders = new ArrayList<>();
                for(String o : orders) {
                    for(int i = 0; i <= o.length(); i++) {
                        newOrders.add(insert(o,increment,i));
                    }
                }
                orders = newOrders;
                increment++;
            }

            for(int i = 0; i < orders.size(); i++) {
                lengths[i] = calcDist(orders.get(i), towns);
            }

            double acc = 0;
            for(double d : lengths) {
                acc += d;
            }
            System.out.println(acc / lengths.length);
        }

    }

    public static double calcDist(String s, Loc[] t) {
        double total = 0;
        int currentPlace = Integer.parseInt(Character.toString(s.charAt(0)));
        for(int i = 1; i < s.length(); i++) {
            total += dist(t[currentPlace], t[i]);
            currentPlace = i;
        }
        return total;
    }

    public static double dist(Loc a, Loc b) {
        double z = Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2);
        return Math.sqrt(z);
    }


    public static String insert(String o, int increment, int position) {
        if(position == o.length()) { return o + increment; }
        else if(position == 0) { return increment + o; }
        else {
            String subA = o.substring(0, position);
            String subB = o.substring(position);
            return subA + increment + subB;
        }
    }

    public static Loc genLoc(String location) {
        String sx = "";
        String sy = "";
        int indexStore = 0;
        for(int i = 0; i < location.length(); i++) {
            char c = location.charAt(i);
            if(Character.isWhitespace(c)) { break; }
            else {
                sx += Character.toString(c);
                indexStore++;
            }
        }
        sy = location.substring(indexStore + 1);
        int x = Integer.parseInt(sx);
        int y = Integer.parseInt(sy);
        return new Loc(x,y);
    }

    public static int fact(int num) {
        int a = num;
        int base = 1;
        while(a > 1) {
            base *= a;
            a--;
        }
        return base;
    }

    public static class Loc {
        int x;
        int y;

        Loc(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
