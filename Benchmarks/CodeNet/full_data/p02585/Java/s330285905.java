import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head = br.readLine().split(" ");
    int n = Integer.parseInt(head[0]);
    int k = Integer.parseInt(head[1]);
    int[] p = Stream.of(br.readLine().split(" ")).mapToInt(value -> Integer.parseInt(value) - 1).toArray();
    long[] c = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
    br.close();

    boolean[] used = new boolean[n];
    Arrays.fill(used, false);
    ArrayList<Cycle> cycleList = new ArrayList<>();
    for(int i = 0; i < n; i++){
      if(used[i]){
        continue;
      } else {
        int pos = i;
        ArrayList<Long> list = new ArrayList<>();
        while(used[pos] == false){
          list.add(c[pos]);
          used[pos] = true;
          pos = p[pos];
        }
        Cycle cycle = new Cycle(list);
        cycleList.add(cycle);
      }
    }
    long ans = Long.MIN_VALUE;
    for(int i = 0; i < cycleList.size(); i++){
      Cycle cycle = cycleList.get(i);
      long size = cycle.list.size();
      long base = 0;
      long limit = 0;
      long loop = Math.max(0, (k / size) - 1);

      if(cycle.sum > 0){
        base = cycle.sum * loop;
        limit = k - (size * loop);
      } else {
        limit = Math.min(k, size - 1);
      }
      for(int j = 0; j < cycle.list.size(); j++){
        long count = 0;
        long sum = base;
        int idx = j;
        while(count < limit){
          sum += cycle.list.get(idx % cycle.list.size());
          ans = Math.max(ans, sum);
          idx++;
          count++;
        }
      }
    }
    System.out.println(ans);
  }
}
class Cycle {
  long sum;
  List<Long> list;
  Cycle(List<Long> list){
    this.list = list;
    sum = this.list.stream().mapToLong(Long::longValue).sum();
  }
}
