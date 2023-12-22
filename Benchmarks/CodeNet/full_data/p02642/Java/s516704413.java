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
    int ai;
    int aj;
    for (int i=0; i<n; i++) {
      ai = aList.get(i);
      for (int j=0; j<n; j++) {
        aj = aList.get(j);
        if ( (i != j) && (ai % aj == 0) ) {
          cnt--;
          break;
        }
      }
    }
    
    System.out.println(cnt);
  }
}
