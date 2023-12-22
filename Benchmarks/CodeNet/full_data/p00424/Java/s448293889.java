public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, m;
    char[] l, r, res;
    String str;
    int i, j;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      l = new char[n];
      r = new char[n];
      for(i = 0;i < n;i++){
        str = sc.next();
        l[i] = str.charAt(0);
        str = sc.next();
        r[i] = str.charAt(0);
      }

      m = sc.nextInt();
      res = new char[m];
      for(i = 0;i < m;i++){
        str = sc.next();
        res[i] = str.charAt(0);
        for(j = 0;j < n;j++){
          if(res[i] == l[j]){
            res[i] = r[j];
            break;
          }
        }
        System.out.print(res[i]);
      }
      System.out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}