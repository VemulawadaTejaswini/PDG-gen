import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Map<Integer, Integer> map = new HashMap<>();

    int loopCount = (int)Math.pow(2, n);
    for(int i = 0; i < loopCount; i++){
      int si = sc.nextInt();
      Integer tmpCount = map.get(si);
      if(tmpCount == null){
        map.put(si, 1);
      }  else  {
        map.put(si, tmpCount + 1);
      }
    }
    List<Integer> list = new ArrayList<>(map.keySet());
    Collections.sort(list, Comparator.reverseOrder());
    if(map.get(list.get(0)) > 1){
      System.out.println("No");
      return;
    }
    // n回最大値をコピーできる
    int canCounter = n;
    int lCount = 1;
    for(int i:list){
      //System.out.println(i + ": " + map.get(i));
      if(canCounter < map.get(i)){
        System.out.println("No");
        return;
      }
      canCounter -= map.get(i);
      canCounter += n - 1;
      lCount++;
    }

    System.out.println("Yes");
  }
}
