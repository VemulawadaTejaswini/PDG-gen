import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author author
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());

    List<Book> stringList = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      stringList.add(new Book(i, sc.next(), Integer.parseInt(sc.next())));
    }
    Collections.sort(stringList);
    for (Book book : stringList) {
      System.out.println(book.getId());
    }
    }
  }




class Book implements Comparable<Book> {

  String s;
  int p;
  int id;

  Book(int id, String s, int p) {
    this.s = s;
    this.p = p;
    this.id = id;
  }

  public String getS() {
    return this.s;
  }

  public int getP() {
    return this.p;
  }

  public int getId() {
    return this.id;
  }

  @Override
  public int compareTo(Book o) {
    if (!this.s.equals(o.s)) {
      return this.s.compareTo(o.s);
   }else {
      return o.p - this.p;
   }
  }

}
