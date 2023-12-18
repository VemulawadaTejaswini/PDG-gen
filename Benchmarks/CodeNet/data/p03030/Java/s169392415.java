import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    Entry[] entryArray = new Entry[N];
    for (int i = 0; i < N; i++) {
      String city = sc.next();
      int point = sc.nextInt();
      entryArray[i] = new Entry(city, point, i+1);
    }
    Arrays.sort(entryArray, new Comparator<Entry>() {
      public int compare(Entry entry1, Entry entry2) {
        int comp = entry1.city.compareTo(entry2.city);
        return comp != 0 ? comp : entry2.point - entry1.point;
      }}); 
    
    for (int i = 0; i < N; i++) {
      System.out.println(entryArray[i].index);
    }
  }
  
  static class Entry {
    private final String city;
    private final int point;
    private final int index;
    Entry(String city, int point, int index) {
      this.city = city;
      this.point = point;
      this.index = index;
    }
  }
}

