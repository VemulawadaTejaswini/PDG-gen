import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Long, Boolean> map = new HashMap<>();
    for(int i = 0; i < n; i++){
      long tmp = sc.nextLong();
      if(!map.containsKey(tmp)){
        map.put(tmp, false);
      }
      map.put(tmp, !map.get(tmp));
    }
    int count = 0;
    for(boolean flag : map.values()){
      if(flag){
        count++;
      }
    }
    System.out.println(count);
  }
}