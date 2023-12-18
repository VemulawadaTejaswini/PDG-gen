import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int numVote = Integer.parseInt(br.readLine());
    Map<String, Integer> voteMap = new HashMap<>();
    
    for(int i=0; i<numVote; i++){
      String name = br.readLine();
      if(voteMap.containsKey(name)){
         voteMap.put(name, voteMap.get(name) + 1);
      } else {
        voteMap.put(name, 1);
      }
    }
    int max = 0;
    StringBuilder result = new StringBuilder();
    
    for(String key: voteMap.keySet().stream().sorted().toArray(String[]::new)){
      int temp = voteMap.get(key);
      if(temp > max){
        result = new StringBuilder(key);
        max = temp;
      } else if(temp == max) {
        result.append("\n").append(key);
      }
    }
    System.out.println(result);
  }
}