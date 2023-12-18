/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String[] s = br.readLine().split(" ");
    int x1 = Integer.parseInt(s[0]);
    int y1 = Integer.parseInt(s[1]);
    int x2 = Integer.parseInt(s[2]);
    int y2 = Integer.parseInt(s[3]);
    if (x1>x2 || (x1==x2 && y2<y1)) {
      int tmp = x2;
      x2 = x1;
      x1 = tmp;
      tmp = y2;
      y2 = y1;
      y1 = y2;
    }
    boolean normalise = false;
    if (y2<y1) {
      y2 = y1 + (y1-y2);
      normalise = true;
    }
    int n = Integer.parseInt(br.readLine());
    Pair[] pairs = new Pair[n];
    int index = 0;
    for (int i=0; i<n; i++) {
      s = br.readLine().split(" ");
      int x = Integer.parseInt(s[0]);
      int y = Integer.parseInt(s[1]);
      if (normalise) {
        if (y>y1) {
          y = y1 - (y-y1);
        } else {
          y = y1 + (y1-y);
        }
      }
      if (x>=x1 && x<=x2 && y>=y1 && y<=y2) {
        pairs[index] = new Pair(x,y);
        index++;
      }
    }
    int nGood = index;
    if (nGood==0) {
      System.out.println((long)(x2-x1 + y2-y1)*(long)100);
      return;
    } 
    Pair[] pairs2 = new Pair[nGood];
    for (int i=0; i<nGood; i++) {
      pairs2[i] = new Pair(pairs[i].x,pairs[i].y);
    }
    Arrays.sort(pairs2);
    List<Integer> seq = new ArrayList<Integer>(nGood);
    
    for (int i=0; i<nGood; i++) {
      seq.add(pairs2[i].y);
    }
    

    List<Integer> lis = longestIncreasingSubsequence(seq);
    long len = lis.size();
    long dx = x2-x1;
    long dy = y2-y1;
    long min = Math.min(dx,dy);
    double ans = 0;
    if (min==0 && len==1) {
      ans = dx*100L + dy*100L - 20 + Math.PI*10.0;
    } else {
      if (len>min)
        len--;
      ans = dx*100L + dy*100L - 20*len + Math.PI*(5L*len);
    }
    System.out.println(ans);

  }
  static <T extends Comparable<? super T>> List<Integer> longestIncreasingSubsequence(List<T> seq) {
    if (seq.size() == 0) return new ArrayList<Integer>();
    List<Integer> a = new ArrayList<>(), parent = new ArrayList<>();
    for (int i = 0; i < seq.size(); i++) parent.add(null);
    for (int i = 0; i < seq.size(); i++) {
      if (a.size() == 0 || seq.get(i).compareTo(seq.get(a.get(a.size() - 1))) > 0) {
        if (a.size() > 0) { parent.set(i, a.get(a.size() - 1)); } a.add(i);
      } else { int index = findNext(seq, a, i); a.set(index, i); if (index != 0) parent.set(i, a.get(index - 1)); } }
    List<Integer> result = new ArrayList<>(); Integer cur = a.get(a.size() - 1);
    while (cur != null) { result.add(cur); cur = parent.get(cur); }
    Collections.reverse(result); return result; }
  static <T extends Comparable <? super T>> int findNext(List <T> c, List<Integer> d, int e) {
    int a = 0, b = d.size() - 1;
    while (b > a) { int mid = (b + a) / 2; if (c.get(d.get(mid)).compareTo(c.get(e)) < 0) a = mid + 1; else b = mid; }
    return b;
  }

}
class Pair implements Comparable<Pair> {
  int x;
  int y;
  public Pair(int xx, int yy) {
    x = xx;
    y = yy;
  }
  public int compareTo(Pair p2) {
    return x-p2.x;
  }
  public String toString() {
    return String.format("(%d,%d)",x,y);
  }
}
