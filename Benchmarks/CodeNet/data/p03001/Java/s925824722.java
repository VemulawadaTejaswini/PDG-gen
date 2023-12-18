import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int hasMultipleSolutions = w % 2 == 0 && h % 2 == 0 && x == w/2 && y == h/2 ? 1 : 0;
        /*
        double min = Double.MAX_VALUE;
        List<Map.Entry<Integer, Integer>> toCheck = new ArrayList<>();
        toCheck.add(new AbstractMap.SimpleEntry<>(0, 0));
        toCheck.add(new AbstractMap.SimpleEntry<>(w, 0));
        toCheck.add(new AbstractMap.SimpleEntry<>(0, h));
        toCheck.add(new AbstractMap.SimpleEntry<>(w, h));
        for (Map.Entry<Integer, Integer> c : toCheck) {
            double distance = distance(x, y, c.getKey(), c.getValue());
            if (distance < min)
                min = distance;
        }
        for (Map.Entry<Integer, Integer> c : toCheck) {
            double distance = distance(x, y, c.getKey(), c.getValue());
            if (distance == min)
                hasMultipleSolutions = 1;
        }


         */

        System.out.println((double) w * (double) h / (double) 2 + " " + hasMultipleSolutions);
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1-x2)^2 + (y1-y2)^2);
    }

}
