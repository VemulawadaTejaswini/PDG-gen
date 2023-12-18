import java.math.BigInteger;
    import java.util.*;
    import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    TreeSet<Integer> l = new TreeSet<>();
    ArrayList<Integer> lList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      l.add(tmp);
      lList.add(tmp);
    }
    lList.sort(Comparator.naturalOrder());
    long result = 0;
    for (int i = 0; i < n; i++) {
      int a = lList.get(i);
      for (int j = i + 1; j < n; j++) {
        int sum = a + lList.get(j);
        result += Math.max(l.headSet(sum).size() - j - 1, 0);
      }
    }
    System.out.println(result);
  }
}
