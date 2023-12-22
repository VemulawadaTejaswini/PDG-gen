import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args){
    int n, m;
    FastScanner fs = new FastScanner(System.in);
    n = fs.nextInt();
    m = fs.nextInt();
    int idx = 0;
    DSU comp = new DSU(n + 1);
    while(idx < m){
      int u, v;
      u = fs.nextInt();
      v = fs.nextInt();
      comp.merge(u, v);
      idx++;
    }
    HashSet<Integer> visited = new HashSet<Integer>();
    ArrayList<Integer> groups = new ArrayList<Integer>();
    int sub = 0;
    int res = 0;
    idx = 1;
    while(idx <= n){
      int rep = comp.find(idx);
      if(!visited.contains(rep)){
        int sz = comp.getSize(idx);
        groups.add(sz);
        visited.add(rep);
      }
      idx++;
    }
    Collections.sort(groups);
    idx = 0;
    while(idx < groups.size()){
      int sz = groups.get(idx);
      res += sz - sub;
      sub += sz - sub;
      idx++;
    }
    System.out.println(res);
  }
}

public class FastScanner {
  private BufferedReader bf;
  private InputStreamReader read;

  //stream can be System.in, a FileInputStream, etc..
  public FastScanner(InputStream stream){
    read = new InputStreamReader(stream);
    bf = new BufferedReader(read);
  }
  /*
    Gives the next token in the buffer
  */
  public String next(){
    String res = "";
    try {
      int read = bf.read();
      //32 is whitespace, -1 EOF, 10 line feed
      while(read == 32 || read == 10){
        read = bf.read();
      }
      while(read != 10 && read != 32 && read != -1){
        res += Character.toString((char)read);
        read = bf.read();
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
    return res.trim();
  }

  public int nextInt() {
    return Integer.parseInt(next());
  }
  public long nextLong(){
    return Long.parseLong(next());
  }

  public boolean hasNext(){
    try {
      return bf.ready();
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }

  public int[] getArrInt(int numToks){
    int res[] = new int[numToks];
      try {
        for(int idx = 0; idx < numToks; idx++){
          res[idx] = nextInt();
        }
        return res;
    } catch (Exception e){
      e.printStackTrace();
      return null;
    }
  }
}


class DSU {
  private int[] adj;
  private int[] maxes;
  private int[] sizes;

  public DSU(int size){
    adj = new int[size];
    maxes = new int[size];
    sizes = new int[size];
    for(int idx = 0; idx < size; idx++){
      adj[idx] = maxes[idx] = idx;
      sizes[idx] = 1;
    }
  }

  public int find(int idx){
    while(adj[idx] != idx){
      idx = adj[idx];
    }
    return idx;
  }

  public int getSize(int idx){
    return sizes[find(idx)];
  }

  public int getMax(int idx){
    return maxes[find(idx)];
  }

  public void merge(int a, int b){
    int aHead = find(a);
    int bHead = find(b);
    if(aHead == bHead){
      return;
    }
    if(sizes[bHead] > sizes[aHead]){
      adj[aHead] = bHead;
      maxes[bHead] = Math.max(maxes[aHead], maxes[bHead]);
      sizes[bHead] += sizes[aHead];
    } else {
      adj[bHead] = aHead;
      maxes[aHead] = Math.max(maxes[aHead], maxes[bHead]);
      sizes[aHead] += sizes[bHead];
    }
  }

}
