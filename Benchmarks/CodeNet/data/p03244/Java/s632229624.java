import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{

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
      // Map<Integer,Integer>[] map ={mapA,mapB};
      List<Map<Integer,Integer>> aMap = new ArrayList<>();
      aMap.add(mapA);
      aMap.add(mapB);
      // map[0] = mapA;
      // map[1] = mapB;
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
        final int j = i;
        aMap.get(j).forEach((key,val) -> {
          if(vm[j] < val) {
            vm[j] = val;
            x[j]  = key;
          }
        });
      }

      int cca = nHalf - vm[0];
      int ccb = nHalf - vm[1];

      int[] vm2 = {0,0};
      final int fxa = x[0];
      final int fxb = x[1];
      int ans = 0;
  
      if(fxa == fxb) {
        for(int i=0; i<aMap.size(); i++) {
          final int j = i;
          aMap.get(j).forEach((key,val) -> {
            if(vm2[j] < val && key != x[j])
              vm2[j] = val;
          });
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