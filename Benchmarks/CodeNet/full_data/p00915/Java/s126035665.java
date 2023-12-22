public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, l, i, j, t, a, b, count;
    int[] p;
    String[] d;
    String tmp;

    for(;;){
      n = sc.nextInt(); l = sc.nextInt();
      if(n == 0 && l == 0)break;
      d = new String[n]; p = new int[n];
      for(i = 0;i < n;i++){
        d[i] = sc.next(); p[i] = sc.nextInt();
      }
      a = -1; b = -1; count = 0;

      for(t = 0;;t++){
//        for(i = 0;i < n;i++)out.println(d[i] + p[i]);
        for(i = 0;i < n;i++){
          if("L".equals(d[i]))p[i]--;
          else p[i]++;
          if(p[i] == 0 || p[i] == l)count++;
        }
        for(i = 0;i < n;i++){
          for(j = i + 1;j < n;j++)if(p[i] == p[j]){
            tmp = d[i]; d[i] = d[j]; d[j] = tmp;
          }
        }
        if(count == n){
          for(i = 0;i < n;i++){
            if(p[i] == 0)a = i + 1;
            if(p[i] == l)b = i + 1;
          }
          break;
        }
      }


      if(a == -1)a = b;
      out.println((t + 1) + " " + a);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}