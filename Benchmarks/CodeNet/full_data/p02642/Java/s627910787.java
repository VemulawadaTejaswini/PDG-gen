import java.util.*;
 
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> aList = new ArrayList<Integer>();
    for (int i=0; i<n; i++) {
      aList.add(sc.nextInt());
    }
    
    int cnt = n;
    Collections.sort(aList);
    HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    
    for (int i=0; i<n; i++) {
      Integer ai = aList.get(i);
      if (map.contains(ai)) {
        if (map.get(ai)) {
          cnt--;
        }
        break;
      } else {
        map.put(ai, false);
        for (int j=0; j<n; j++) {
          Integer aj = aList.get(j);
          if ( i!=j && (ai%aj==0) ) {
            cnt--;
            map.put(ai, true);
            break;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}
