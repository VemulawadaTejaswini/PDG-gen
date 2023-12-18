import java.util.*;

public class Main{
  public static void main(String[] argv){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++){
      list.add(sc.nextInt());
    }

    Collections.sort(list);

    int ans = 0;
    for (int b = 0; b < n; b++){
      for (int a = 0; a < b; a++){
        int key = list.get(b) + list.get(a);
        int idx = ~Collections.binarySearch(list, key, (x,y)->x.compareTo(y)>=0?1:-1);
        if (idx > 0){
	        ans = ans + idx - (b + 1);
        }
      }
    }

    System.out.println(ans);

  }
}