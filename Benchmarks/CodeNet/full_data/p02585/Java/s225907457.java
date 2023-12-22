import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long answer = Long.MIN_VALUE;
    int[] p = new int[n];
    long[] c = new long[n];
    for(int i = 0; i < n; i++) p[i] = sc.nextInt() - 1;
    for(int i = 0; i < n; i++) c[i] = sc.nextLong();
    List<Cycle> cycleList = new ArrayList<>();
    boolean[] isVisit = new boolean[n];
    Arrays.fill(isVisit, false);
    for(int i = 0; i < n; i++){
      int idx = i;
      if(isVisit[idx] == true){
        continue;
      }
      ArrayList<Long> cList = new ArrayList<>();

      while(true){
        if(isVisit[idx] == true) break;
        cList.add(c[p[idx]]);
        isVisit[idx] = true;
        idx = p[idx];
      }
      cycleList.add(new Cycle(cList.stream().mapToLong(l -> l).toArray()));
    }
    for(Cycle cycle : cycleList){
      if(cycle.total <= 0 ){
        int k2 = Integer.min(k, cycle.size);
        for(int i2 = 0; i2 < cycle.size; i2++){
          long total2 = 0;
          int cnt = 0;
          while(cnt < k2){
            total2 += cycle.c[(i2 + cnt) % cycle.size];
            answer = Math.max(answer, total2);
            cnt++;
          }
        }
      } else {
        int k1 = Integer.max(0, (k / cycle.size) - 1);
        int k2 = Integer.min(k, cycle.size + (k % cycle.size));
        for(int i2 = 0; i2 < cycle.size; i2++){
          long total2 = cycle.total * k1;
          int cnt = 0;
          while(cnt < k2){
            total2 += cycle.c[(i2 + cnt) % cycle.size];
            answer = Math.max(answer, total2);
            cnt++;
          }
        }
      }
    }
    System.out.println(answer);
  }
  static class Cycle {
    long total;
    int size;
    long[] c;
    public Cycle(long[] c){
      this.c = c;
      size = c.length;
      for(long v : c){
        total += v;
      }
    }
  }
}