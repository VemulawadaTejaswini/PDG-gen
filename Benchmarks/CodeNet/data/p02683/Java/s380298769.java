import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int x = scan.nextInt();
    int [][] a = new int[n][m+1];
    for (int i=0;i<n;i++){
      a[i][0] = scan.nextInt();
      for (int j=1;j<m+1;j++){
        a[i][j] = scan.nextInt();
      }
    }
    long g = (long) Math.pow(2,n);
    boolean check = false;
    ArrayList<Integer> kk = new ArrayList<Integer>();
    for (int i=0;i<g;i++){
      int ss [] = new int[m];
      int price = 0;
      int [] k = find(n,i);
      for (int mm=0;mm<n;mm++){
        if (k[mm] == 0){
          continue;
        }
        else{
          price += a[mm][0];
          for (int jj=1;jj<m+1;jj++){
            ss[jj-1] += a[mm][jj];
          }
        }
      }
      if (check(ss,x) == true){
        kk.add(price);
      }
    }

    if (kk.size() == 0){
      System.out.println(-1);
    }
    else{
      int min = kk.get(0);
      for (int v = 0;v<kk.size();v++){
        if (min>kk.get(v)){
          min = kk.get(v);
        }
      }
      System.out.println(min);
    }


  }

  public static boolean check(int[] a,int b){
    for (int i=0;i<a.length;i++){
      if(a[i] < b){
        return false;
      }
    }
    return true;
  }

  public static int[] find(int a,long b){
    int[] g = new int[a];
    int j = a-1;
    while (b>0){
      if (b%2 == 0){
        g[j] = 0;
      }
      else{
        g[j] = 1;
        b -= 1;
      }
      j -= 1;
      b = (long) b/2;
    }
    return g;
  }

}
