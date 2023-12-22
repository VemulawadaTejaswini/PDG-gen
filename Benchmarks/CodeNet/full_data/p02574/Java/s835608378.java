import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] b = new int[1000001];
    HashSet<Integer> aa = new HashSet<Integer>();
    for (int i=0;i<n;i++){
      aa.add(scan.nextInt());
    }

    n = aa.size();
    int cc = 0;
    int [] a = new int[n];
    for (int ggg : aa){
      a[cc] = ggg;
      cc += 1;
    }

    for (int j=0;j<n;j++){
      int t = a[j];
      b[t] += 1;
      int k = (int) Math.sqrt(t);
      if (k*k == t){
        b[k] -= 1;
      }

      for (int i=k;i>=2;i--){
        if (t%i == 0){
          b[i] += 1;
          int g = (int) t/i;
          b[g] += 1;
        }
      }
    }

    boolean p = true;
    for (int i=2;i<1000001;i++){
      if (b[i] > 1){
        p = false;
      }

      if (b[i] == n){
        System.out.println("not coprime");
        return;
      }
    }

    if (p == true){
      System.out.println("pairwise coprime");
    }
    else{
      System.out.println("setwise coprime");
    }


  }
}
