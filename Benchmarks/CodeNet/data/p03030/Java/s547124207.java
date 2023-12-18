import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.io.IOException;

public class Main {
    static class Store implements Comparable<Store> {
        int index;
        String name;
        int score;

        Store(int index, String name, int score) {
            this.index = index;
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(Store s) {
            if(name.equals(s.name)) return s.score - score;
            return name.compareTo(s.name);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Store> stores = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            stores.add(new Store(i, in[0], Integer.parseInt(in[1])));
        }

        while(!stores.isEmpty()) {
            Store s = stores.poll();
            System.out.println(s.index + 1);
        }

        br.close();
    }
}