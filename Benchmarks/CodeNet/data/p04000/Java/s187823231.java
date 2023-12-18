import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  static long h, w;
  static int n;
  static int[] a, b;

  public static void main(String[] args){
    FastScanner sc = new FastScanner();

    h = sc.nextInt(); w = sc.nextInt();
    n = sc.nextInt();
    a = new int[n]; b = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
    }
    Set< Pair > set = new TreeSet< Pair >();
    for(int i = 0; i < n; i++){
      set.add(new Pair(b[i], a[i]));
    }

    long[] counts = new long[10];
    int[] dxc = new int[]{0, -1, -1, -1, 0, 1, 1, 1};
    int[] dyc = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};
    int[] dxlr = new int[]{1, 2, 0, 1, 2, 0, 1, 2};
    int[] dylr = new int[]{0, 0, 1, 1, 1, 2, 2, 2};
    int[] dxll = new int[]{1, 2, 0, 1, 2, 0, 1, 2};
    int[] dyll = new int[]{0, 0, -1, -1, -1, 1, 1, 1};
    int[] dxuu = new int[]{-1, 1, -1, 0, 1, -1, 0 ,1};
    int[] dyuu = new int[]{0, 0, -1, -1, -1, -2, -2, -2};
    int[] dxll2 = new int[]{1, 2, 0, 1, 2, 0, 1, 2};
    int[] dyll2 = new int[]{0, 0, -1, -1, -1, -2, -2, -2};
    for(Pair p : set){
      boolean flag = true;
      int count = 1;
      for(int i = 0; i < 8; i++){
        int nx = p.s + dxc[i], ny = p.t + dyc[i];
        if(!check(nx, ny)){
          flag = false;
          break;
        }
        if(set.contains(new Pair(nx, ny))){
          ++count;
        }
      }
      if(flag){
        System.out.println("c");
        System.out.println(count);
        System.out.println("x,y" + p.s +  " " + p.t);
        ++counts[count];
      }

      flag = true;
      count = 1;
      for(int i = 0; i < 8; i++){
        int nx = p.s + dxlr[i], ny = p.t + dylr[i];
        if(!check(nx, ny)){
          flag = false;
          break;
        }
        if(set.contains(new Pair(nx, ny))){
          ++count;
        }
      }
      if(flag){
        ++counts[count];
      }

      flag = true;
      count = 1;
      for(int i = 0; i < 8; i++){
        int nx = p.s + -dxlr[i], ny = p.t + -dylr[i];
        if(!check(nx, ny)){
          flag = false;
          break;
        }
        if(set.contains(new Pair(nx, ny))){
          ++count;
        }
      }
      if(flag){
        ++counts[count];
      }

      flag = true;
      count = 1;
      for(int i = 0; i < 8; i++){
        int nx = p.s + dxll[i], ny = p.t + dyll[i];
        if(!check(nx, ny)){
          flag = false;
          break;
        }
        if(set.contains(new Pair(nx, ny))){
          ++count;
        }
      }
      if(flag){
        ++counts[count];
      }

      flag = true;
      count = 1;
      for(int i = 0; i < 8; i++){
        int nx = p.s + -dxll[i], ny = p.t + dyll[i];
        if(!check(nx, ny)){
          flag = false;
          break;
        }
        if(set.contains(new Pair(nx, ny))){
          ++count;
        }
      }
      if(flag){
        ++counts[count];
      }

      flag = true;
      count = 1;
      for(int i = 0; i < 8; i++){
        int nx = p.s + dxuu[i], ny = p.t + dyuu[i];
        if(!check(nx, ny)){
          flag = false;
          break;
        }
        if(set.contains(new Pair(nx, ny))){
          ++count;
        }
      }
      if(flag){
        ++counts[count];
      }

      flag = true;
      count = 1;
      for(int i = 0; i < 8; i++){
        int nx = p.s + dxuu[i], ny = p.t + -dyuu[i];
        if(!check(nx, ny)){
          flag = false;
          break;
        }
        if(set.contains(new Pair(nx, ny))){
          ++count;
        }
      }
      if(flag){
        ++counts[count];
      }

      flag = true;
      count = 1;
      for(int i = 0; i < 8; i++){
        int nx = p.s + dxll2[i], ny = p.t + dyll2[i];
        if(!check(nx, ny)){
          flag = false;
          break;
        }
        if(set.contains(new Pair(nx, ny))){
          ++count;
        }
      }
      if(flag){
        ++counts[count];
      }

      flag = true;
      count = 1;
      for(int i = 0; i < 8; i++){
        int nx = p.s + -dxll2[i], ny = p.t + -dyll2[i];
        if(!check(nx, ny)){
          flag = false;
          break;
        }
        if(set.contains(new Pair(nx, ny))){
          ++count;
        }
      }
      if(flag){
        ++counts[count];
      }
    }
/*
    for(int i = 0; i < 10; i++){
      System.out.println(counts[i]);
    }
    */

    long sum = 0;
    for(int i = 1; i < 10; i++){
      counts[i] /= i;
      sum += counts[i];
    }

    counts[0] = (w - 2) * (h - 2) - sum;
    for(int i = 0; i < 10; i++){
      System.out.println(counts[i]);
    }
  }

  static boolean check(int x, int y){
    return 0 <= x && x < w && 0 <= y && y < h;
  }

  static class Pair implements Comparable< Pair > {
    int s, t;

    Pair(int s, int t){
      this.s = s; this.t = t;
    }

    @Override
    public int compareTo(Pair p){
      if(s == p.s){
        return t - p.t;
      }
      return s - p.s;
    }

    @Override
    public boolean equals(Object obj){
      if(!(obj instanceof Pair)){
        return false;
      }
      Pair p = (Pair)obj;
      return s == p.s && t == p.t;
    }

    @Override
    public int hashCode(){
      return 13 ^ s ^ t;
    }
  }
}
