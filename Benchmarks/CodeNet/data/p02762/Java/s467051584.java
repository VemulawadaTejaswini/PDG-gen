import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args){
    FastScanner fs = new FastScanner(System.in);
    int n, m, k;
    n = fs.nextInt();
    m = fs.nextInt();
    k = fs.nextInt();

    List<Integer>[] adjf = new ArrayList[n + 1];
    int[] kdec = new int[n + 1];

    DSU comp = new DSU(n + 1);

    while(m > 0){
      int a, b;
      a = fs.nextInt();
      b = fs.nextInt();
      if(adjf[a] == null){
        adjf[a] = new ArrayList<>();
      }
      if(adjf[b] == null){
        adjf[b] = new ArrayList<>();
      }
      adjf[a].add(b);
      adjf[b].add(a);
      comp.merge(a, b);
      m--;
    }
    while(k > 0){
      int a, b;
      a = fs.nextInt();
      b = fs.nextInt();
      if(comp.find(a) == comp.find(b)){
        kdec[a]++;
        kdec[b]++;
      }
      k--;
    }
    int[] res = new int[n];
    for(int f = 1; f <= n; f++){
      int fsize = adjf[f] == null ? 0 : adjf[f].size();
      res[f - 1] = Math.max(0, (comp.getSize(f) - fsize - kdec[f] - 1));
    }
    for(int idx : res){
      System.out.print(idx + " ");
    }

  }
}

class FastScanner {
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
  public String toString(){
    return Arrays.toString(adj);
  }

}
