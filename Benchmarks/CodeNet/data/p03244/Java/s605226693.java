import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());
      String line = in.readLine();
      int nHalf = n >> 1;

      int[] seqA = new int[nHalf];
      int[] seqB = new int[nHalf];
      int[][] seq = {seqA, seqB};

      Integer num;
      Map<Integer,Integer> mapA = new HashMap<>();
      Map<Integer,Integer> mapB = new HashMap<>();
      List<Map<Integer,Integer>> aMap = new ArrayList<>();
      aMap.add(mapA);
      aMap.add(mapB);
      int offset=0,next=0;
      char regx = ' ';

      for(int i=0; i<n; i++) {
        if((next = line.indexOf(regx,offset)) == -1)
          next = line.length();
        num = new Integer(line.substring(offset, next));
        offset = ++next;

        seq[(i&1)][i>>1] = num;
        aMap.get(i&1).merge(num, 1, Integer::sum);
      }

      int[] vm = {0,0};
      int[] x =  {0,0};

      for (int i=0; i<aMap.size(); i++) {
        for (Map.Entry<Integer,Integer> m : aMap.get(i).entrySet()) {
          if(vm[i] < m.getValue()) {
            vm[i] = m.getValue();
            x[i]  = m.getKey();
          }
        }
      }

      int cca = nHalf - vm[0];
      int ccb = nHalf - vm[1];

      int[] vm2 = {0,0};
      int ans = 0;
  
      if(x[0] == x[1]) {
        for(int i=0; i<aMap.size(); i++) {
          for (Map.Entry<Integer,Integer> m : aMap.get(i).entrySet()) {
            if(vm2[i] < m.getValue() && m.getKey() != x[i]) {
              vm2[i] = m.getValue();
            }
          }
        }
      
        int cca2 = nHalf -vm2[0];
        int ccb2 = nHalf -vm2[1];

        ans = cca2 > ccb2 ? cca + ccb2 : cca2 + ccb;
      }
      else {
        ans = cca + ccb;
      }

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}