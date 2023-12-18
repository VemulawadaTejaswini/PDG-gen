import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    TreeMap<Integer,Integer> map = new TreeMap<>();
    int count = 0;
    for(int i = 0; i < n; i++) {
      map.put(scan.nextInt(),count);
      count++;
    }
    int result = 0;
    count = 0;
    for(Map.Entry entry : map.entrySet()) {
      if((int)entry.getValue()%2 != count%2) result++;
      //System.out.println(entry.getValue());
      count++;
    }

    System.out.println(result/2);
  }
}
