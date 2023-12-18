import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    int n = Integer.parseInt(br.readLine());
    Map<String, Map<Integer, Integer>> m = new HashMap<>();
    String[] data;
    String city;
    int point;
    for (int i=0; i<n; i++){
      data = br.readLine().split(" ");
      city = data[0];
      point = Integer.parseInt(data[1]);
      if (!m.containsKey(city)){
        m.put(city, new HashMap<>());
      }
      m.get(city).put(point, i+1);
    }
    Object[] name = m.keySet().toArray();
    Arrays.sort(name);
    for (Object s : name){
      Object[] o = m.get(s).keySet().toArray();
      Arrays.sort(o, Collections.reverseOrder());
      for (Object i : o){
        System.out.println(m.get(s).get(i));
      }
    }
  }
}
