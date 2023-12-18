import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    scan.nextLine();
    String S;
    String[] sArray;
    String[][] sArray2 = new String[N][2];
    Set<String> key = new TreeSet<>();
    for (int i = 0; i < N; i++) {
      S = scan.nextLine();
      sArray = S.split(" ");
      sArray2[i][0] = sArray[0];
      sArray2[i][1] = sArray[1];
      key.add(sArray[0]);
    }
    Map<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
      public int compare(Integer k1, Integer k2) {
        return k2.compareTo(k1) ;
      }
    });
    for (String k : key) {
      for (int i = 0; i < N; i++) {
        if (k.equals(sArray2[i][0])) {
          map.put(Integer.parseInt(sArray2[i][1]), i + 1);
        }
      }
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        System.out.println(entry.getValue());
      }
      map.clear();
    }
  }
}

