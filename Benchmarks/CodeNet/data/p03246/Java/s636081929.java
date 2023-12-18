import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long n = sc.nextLong();
    List<Long> a = new ArrayList<Long>();
    int count = 0;
    for(int i = 0; i < n; i++){
      a.add(i, sc.nextLong());
    }
    if(a.get(0) == a.get(1)){
      a.set(1, a.get(0) + 1);
      count++;
    }
    if(4 <= n){
      for(int i = 2; i < n; i += 2){
        if(a.get(0) != a.get(i)){
          count++;
        }
      }
      for(int i = 3; i < n; i += 2){
        if(a.get(1) != a.get(i)){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}