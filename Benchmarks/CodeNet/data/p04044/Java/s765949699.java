import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int L = sc.nextInt();

    Set<String> treeSet = new TreeSet<String>();

    for (int i = 0; i < N; i++) {
      treeSet.add(sc.next());
    }

    sc.close();

    for (String value : treeSet) {
        System.out.print(value);
    }

    System.out.println("");

  }

}