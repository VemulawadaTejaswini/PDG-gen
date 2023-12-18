import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();

    ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    for (int i=0;i<m;i++){
      ArrayList<Integer> b = new ArrayList<Integer>();
      a.add(b);
    }

    for (int i=0;i<m;i++){
      int a1 = scan.nextInt();
      int a2 = scan.nextInt();

      ArrayList<Integer> c1 = a.get(a1-1);
      c1.add(a2);

      ArrayList<Integer> c2 = a.get(a2-1);
      c2.add(a1);
    }

    int ret = 0;
    boolean[] g = new boolean[n+1];

    for (int j=0;j<=n;j++){
      g[j] = false;
    }
    ret = find(a,0,1,g,1,n);
    System.out.println(ret);
  }

  static int find(ArrayList<ArrayList<Integer>> a, int sum, int current, boolean[] b, int where, int target){
    if (current == target){
      sum += 1;
      return sum;
    }

    ArrayList<Integer> n = a.get(where-1);
    b[where] = true;

    for (int k : n){
      if (b[k] == true){
        continue;
      }
      sum = find(a,sum,current+1,b,k,target);
    }

    b[where] = false;

    return sum;

  }

}
