import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();

    Map<String,Integer> map = new TreeMap<>();
    for(int i = 0;i < N;i++){
      String str = scan.next();
      if(map.containsKey(str)){
      map.put(str,map.get(str) + 1);
      }else{
        map.put(str,0);
      }
    }
    int maxv = 0;
    for(int v : map.values()){
      if(v > maxv) maxv = v;
    }
    for(String str : map.keySet()){
      if(map.get(str) == maxv){
        System.out.println(str);
      }
    }
  }
}