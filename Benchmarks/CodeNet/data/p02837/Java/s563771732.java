import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = (int) Math.pow(2,n);
    int max = 0;
    ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    for (int i=0;i<n;i++){
      int g = scan.nextInt();
      ArrayList<Integer> b = new ArrayList<Integer>();
      for (int k = 0;k<g;k++){
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (d == 0){
          c = -c;
        }
        b.add(c);
      }
      a.add(b);
    }

    for (int j=0;j<m;j++){
      int[] dd = find(j,n);
      int l = check(dd,a);
      if (l>max){
        max = l;
      }
    }


    System.out.println(max);
  }

  static int[] find(int a, int b){
    int[] g = new int[b];
    int f = 0;
    while (a > 0){
      int t = a%2;
      g[f] = t;
      a -= t;
      a = (int) a/2;
      f++;
    }
    return g;
  }

  static int check(int[] a, ArrayList<ArrayList<Integer>> h){
    int sum = 0;
    int n = a.length;
    boolean [] b = new boolean[n];
    for (int i=0;i<n;i++){
      b[i] = false;
      if (a[i] == 1){
        sum += 1;
        b[i] = true;
      }
    }

    for (int j=0;j<n;j++){
      if (a[j] == 0){
        continue;
      }
      ArrayList<Integer> t = h.get(j);
      for (int k=0;k<t.size();k++){
        int p = t.get(k);
        if (p<0){
          int ff = -p;
          ff -= 1;
          if (b[ff] == true){
            return 0;
          }
        }
        else{
          p -= 1;
          if (b[p] == false){
            return 0;
          }
        }
      }
    }
    return sum;
  }
}
