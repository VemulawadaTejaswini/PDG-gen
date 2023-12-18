import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] restaurants = new String[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = Integer.parseInt(sc.next());
            restaurants[i] = name + String.format("%010d", 100-score) + "/" + (i + 1);
        }

        Arrays.sort(restaurants);
        StringBuilder sb = new StringBuilder();
        for (String target : restaurants) {
            String[] info = target.split("/");
            sb.append(info[1]);
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}