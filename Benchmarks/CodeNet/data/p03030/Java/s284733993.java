import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        int[] P = new int[N];
        Restaurant[] restaurants = new Restaurant[N];
        ArrayList<Restaurant> al = new ArrayList<Restaurant>();
        for(int i = 0; i < N; i++) {
            S[i] = sc.next();
            P[i] = sc.nextInt();
            restaurants[i] = new Restaurant(i+1, S[i], P[i]);
            al.add(restaurants[i]);
        }
        sc.close();

        Collections.sort(al, new RestaurantCompare());
        for (Restaurant restaurant : al) {
            System.out.println(restaurant.index);
        }
    }
}

class Restaurant {
    int index;
    String name;
    int score;
    Restaurant(int index_p, String name_p, int score_p) {
        index = index_p;
        name = name_p;
        score = score_p;
    }
    public int getIndex() {
        return index;
    }
}

class RestaurantCompare implements Comparator<Restaurant> {
    public int compare(Restaurant a, Restaurant b) {
        if (a.name.compareTo(b.name) < 0) {
            return -1;
        } else if (a.name.compareTo(b.name) == 0) {
            if (a.score > b.score) {
                return -1;
            }
            return 1;
        } else {
            return 1;
        }
    }
}
