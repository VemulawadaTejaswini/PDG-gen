import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    new Main().run();
  }

  public void run() {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n;
      Map<Integer,Integer> map = new HashMap<>();
      Set<Integer> set = new HashSet<>();
      StringBuilder buf = new StringBuilder();
  
      n = Integer.parseInt(br.readLine());
      while(true) {
        br.lines()
          .limit(n)
          .map( line -> {
            String[] lines = line.split(" ");
            Integer[] nums = new Integer[] {
              Integer.parseInt(lines[0]),
              Integer.parseInt(lines[1]) * Integer.parseInt(lines[2])
            };

            Integer val = map.get(nums[0]);
            if(val == null)
              map.put(nums[0],nums[1]);
            else
              map.replace(nums[0],nums[1]+=val);

            return nums;
          })
          .filter(nums -> nums[1] >= 1_000_000)
          .forEach(nums -> {
            if(set.add(nums[0]))
              buf.append(nums[0]).append("\n");
          });
        
        if(set.isEmpty()) buf.append("NA\n");

        if((n = Integer.parseInt(br.readLine())) == 0 ) break;
        map.clear();
        set.clear();
      }

      System.out.print(buf);
        
    } catch (IOException e) {
      System.err.println(e);
    }
  }
}
