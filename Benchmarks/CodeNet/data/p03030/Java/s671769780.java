import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    PriorityQueue<Restaurant> pq = new PriorityQueue<>();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      int n = Integer.parseInt(br.readLine());
      for (int k=0;k<n;k++) {
        String[] s = br.readLine().split("\\s+");
        pq.offer(new Restaurant(s[0],Integer.parseInt(s[1]),k+1));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    while (!pq.isEmpty()) System.out.println(pq.poll().id);
  }
  private class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int value;
    private int id;
    Restaurant(String name,int value,int id) {
      this.name = name;
      this.value = value;
      this.id = id;
    }
    @Override
    public int compareTo(Restaurant other) {
      if (name.equals(other.name)) return -Integer.compare(value,other.value);
      return name.compareTo(other.name);
    }
  }
}