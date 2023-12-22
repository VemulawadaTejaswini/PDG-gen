public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, m;
    int[] c, d;
    int i, j, k, tmp, ans;

    n = sc.nextInt();
    m = sc.nextInt();
    c = new int[m];
    d = new int[m];
    ans = 0;

    for(i = 0;i < m;i++){
      c[i] = sc.nextInt();
      d[i] = sc.nextInt();
    }
    sc.close();

    for(i = 0;i < m;i++){
      for(j = 0;j < (m - i - 1);j++){
        if(c[j] > c[j + 1]){
          tmp = c[j];
          c[j] = c[j + 1];
          c[j + 1] = tmp;
          tmp = d[j];
          d[j] = d[j + 1];
          d[j + 1] = tmp;
        }
      }
    }

    for(j = 0;j < m;j++){
      tmp = j;
      for(k = j;k < m;k++){
        if(d[j] < c[k]){
          d[j] = d[k - 1];
          j = k - 1;
          break;
        }
      }
      ans = ans + (d[j] - c[tmp]) * 2;
    }

    ans += (n + 1);
    System.out.println(ans);

/*fin*/
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}