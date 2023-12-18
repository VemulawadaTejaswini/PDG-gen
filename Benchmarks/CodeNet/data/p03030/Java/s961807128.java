import java.util.*;
import java.io.*;

class template {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        for (int i = 0; i < num; ++i) {
            String[] temp = br.readLine().split(" ");
            restaurants.add(new Restaurant(i + 1, Integer.parseInt(temp[1]), temp[0]));
        }

        Collections.sort(restaurants);
        for (Restaurant x : restaurants) {
            bw.append(x.order + "\n");
        }
        bw.flush();
    }
}

class Restaurant implements Comparable<Restaurant> {
    int order, rating;
    String item;

    public Restaurant(int order, int rating, String item) {
        this.order = order;
        this.rating = rating;
        this.item = item;
    }

    @Override
    public int compareTo(Restaurant that) {
        if (this.item.equals(that.item)) {
            return that.rating - this.rating;
        } else {
            return this.item.compareTo(that.item);
        }
    }

}