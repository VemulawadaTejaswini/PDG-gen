public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, m;
    int[] c, d;
    int i, j, k, tmp, ans, cmp;

    n = sc.nextInt();
    m = sc.nextInt();
    c = new int[m];
    d = new int[m];
    ans = 0;
    cmp = 0;

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
        }else if(c[j] == c[j + 1] && d[j] > d[j + 1]){
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
        if(c[k] > d[j] || d[j] > d[k]){
          d[j] = d[k - 1];
          j = k - 1;
          cmp = 0;
          break;
        }
        cmp = 1;
      }
      ans = ans + (d[k - 1] - c[tmp]) * 2;
      if(cmp == 1)break;
    }

    ans += (n + 1);
    System.out.println(ans);

/*fin*/
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}