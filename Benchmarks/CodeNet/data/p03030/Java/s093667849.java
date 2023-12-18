import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        PriorityQueue<Restaurant> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            Restaurant r = new Restaurant(st.nextToken(), Integer.parseInt(st.nextToken()), i+1);
            pq.offer(r);
        }

        for (int i = 1; i <= n; i++) {
            Restaurant r = pq.poll();
            System.out.println(r.id);
        }

    }

    static class Restaurant implements Comparable<Restaurant>{
        String city;
        int score, id;
        public Restaurant(String city, int score, int id) {
            this.city = city;
            this.score = score;
            this.id = id;
        }
        public int compareTo(Restaurant r) {
            if (r.city.equals(this.city)) {
                if (this.score > r.score) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(r.city);
                list.add(this.city);
                Collections.sort(list);
                if (list.get(0).equals(this.city)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }
}
/*

 */