import java.util.Scanner;

public class Main {

  static class Restaurant {
    public int id;
    public String city;
    public int rating;

    public Restaurant(int id, String city, int rating) {
      this.id = id;
      this.city = city;
      this.rating = rating;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Restaurant[] rs = new Restaurant[n];

    for (int i = 0; i < n; ++i) {
      String s = sc.next();
      int p = sc.nextInt();
      rs[i] = new Restaurant(i + 1, s, p);
    }

    for (Restaurant r : mergeSort(rs))
      System.out.println(r.id);
  }

  public static Restaurant[] mergeSort(Restaurant[] a) {
    if (a.length <= 1)
      return a;

    int mid = a.length / 2;
    Restaurant[] left = new Restaurant[mid];
    Restaurant[] right = new Restaurant[a.length - mid];

    for (int i = 0; i < mid; ++i)
      left[i] = a[i];

    for (int i = mid; i < a.length; ++i)
      right[i - mid] = a[i];

    return merge(mergeSort(left), mergeSort(right));
  }

  public static Restaurant[] merge (Restaurant[] l, Restaurant[] r) {
    Restaurant[] merged = new Restaurant[l.length + r.length];

    int i = 0, j = 0, k = 0;
    while (i < l.length && j < r.length) {
      if (l[i].city.compareTo(r[j].city) < 0 || l[i].city.equals(r[j].city) && l[i].rating >= r[j].rating)
        merged[k++] = l[i++];
      else
        merged[k++] = r[j++];
    }

    while (i < l.length)
      merged[k++] = l[i++];
    while (j < r.length)
      merged[k++] = r[j++];

    return merged;
  }
}