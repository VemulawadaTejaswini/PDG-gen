import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    int n = Integer.parseInt(data[0]);
    int x = Integer.parseInt(data[1]);
    int y = Integer.parseInt(data[2]);
    int[][] distArray = new int[n][n];
    Route route = new Route(n);
    route.shortcut(x, y);
    for (int i=0; i<n; i++){
      distArray[i] = route.calcDist(i);
    }
    int[] result = new int[n];
    for (int i=0; i<n; i++){
      for (int j=0; j<n; j++){
        result[distArray[i][j]]++;
      }
    }
    StringBuilder s = new StringBuilder();
    for (int i=1; i<result.length; i++){
      result[i]/=2;
      s.append(result[i]);
      s.append("\n");
    }
    System.out.println(s);
  }
}

class Route{
  List<int[]> nodes;
  Route(int size){
    nodes = new ArrayList<>();
    for (int i=0; i<size; i++){
      if (i==0){
        nodes.add(new int[]{1});
      } else if (i==size-1){
        nodes.add(new int[]{size-1-1});
      } else {
        nodes.add(new int[]{i-1, i+1});
      }
    }
  }
  void shortcut(int idx1, int idx2){
    int[] a = nodes.get(idx1-1);
    int[] b = nodes.get(idx2-1);
    int[] newa = new int[a.length+1];
    int[] newb = new int[b.length+1];
    System.arraycopy(a, 0, newa, 0, a.length);
    System.arraycopy(b, 0, newb, 0, b.length);
    newa[a.length] = idx2-1;
    newb[b.length] = idx1-1;
    nodes.set(idx1-1, newa);
    nodes.set(idx2-1, newb);
  }
  int[] calcDist(int startIdx){
    int[] result = new int[nodes.size()];
    Arrays.fill(result, Integer.MAX_VALUE-1);
    result[startIdx] = 0;
    Map<Integer, int[]> nextNode = new HashMap<>();
    nextNode.put(startIdx, nodes.get(startIdx));
    for (int i=0; i<nodes.size()-1; i++){
      for (Map.Entry<Integer, int[]> entry : nextNode.entrySet()){
        Map<Integer, int[]> next = new HashMap<>();
        for (int node : entry.getValue()){
          next.put(node, nodes.get(node));
          result[node] = Math.min(result[node], result[entry.getKey()] + 1);
        }
        nextNode = next;
      }
    }
    return result;
  }
}