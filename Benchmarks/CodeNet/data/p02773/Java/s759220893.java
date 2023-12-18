import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      int N = Integer.parseInt(br.readLine());
      Map<String, Integer> map = new HashMap<>();
      int max = 1;
      for(int i = 0; i < N; i++){
        String S = br.readLine();
        if(map.containsKey(S)){
          int m = map.get(S)+1;
          map.put(S, m);
          max = Math.max(max, m);
        }else{
          map.put(S, 1);
        }
      }
      
      List<String> list = new ArrayList<>();
      for(Map.Entry<String, Integer> en : map.entrySet()){
        if(en.getValue() == max){
          list.add(en.getKey());
        }
      }
      
      Collections.sort(list);
      for(String s : list){
        System.out.println(s);
      }
    }catch(Exception e){
    }
  }
}