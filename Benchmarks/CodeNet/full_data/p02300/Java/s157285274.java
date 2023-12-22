public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] x, y;
    int i, numr, numl, ncon;
    int[] resx, resy, anslx, ansly;

    n = sc.nextInt();
    x = new int[n];
    y = new int[n];
    resx = new int[n];
    resy = new int[n];

    for(i = 0;i < n;i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    sc.close();

    quicksort(x, y, 0, n);

    numr = rcovering(x, y, resx, resy);
    if(n == numr){
      ncon = numr;
    }else{
      reverse(x, y);
      anslx = new int[n];
      ansly = new int[n];
      numl = rcovering(x, y, anslx, ansly);

      ncon = numr + numl;
      for(i = 0;i < numl;i++){
        resx[numr + i] = anslx[i];
        resy[numr + i] = ansly[i];
      }
    }
    
    System.out.println(ncon);
    for(i = 0;i < ncon;i++){
      System.out.println(resx[i] + " " + resy[i]);
    }

  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int rcovering(int[] x, int[] y, int[] ansx, int[] ansy){
    int i, n, num;
    n = x.length;

    ansx[0] = x[0];
    ansy[0] = y[0];
    ansx[1] = x[1];
    ansy[1] = y[1];
    num = 2;
    for(i = 2;i < n;i++){
      ansx[num] = x[i];
      ansy[num] = y[i];
      num = gscan(ansx, ansy, num);
    }
    if(ansx[num - 1] == x[n - 1] && ansy[num - 1] == y[n - 1])num--;

    return num;
  }

  private static void quicksort(int[] x, int[] y, int p, int r){
    int q, i;
    if(p < r){
      q = partition(x, y, p, r);
      quicksort(x, y, p, q);
      quicksort(x, y, q + 1, r);
    }
    return;
  }
  private static int partition(int[] x, int[] y, int t, int s){
    int k, j, tmp;
    for(k = t - 1;;){
      for(j = k + 1;j < s;j++){
        if(alow(x[j], y[j], x[s - 1], y[s - 1])){
          k++;
          tmp = x[k];
          x[k] = x[j];
          x[j] = tmp;
          tmp = y[k];
          y[k] = y[j];
          y[j] = tmp;
          if(j == s - 1)return k;
          break;
        }
      }
    }
  }
  private static boolean alow(int ax, int ay, int bx, int by){
    if(ay < by || (ay == by && ax <= bx)){
      return true;
    }else{
      return false;
    }
  }
  private static void reverse(int[] x, int[] y){
    int n, tmp, i;
    n = x.length;
    for(i = 0;i < n / 2;i++){
      tmp = x[i];
      x[i] = x[n - 1 - i];
      x[n - 1 - i] = tmp;
      tmp = y[i];
      y[i] = y[n - 1 - i];
      y[n - 1 - i] = tmp;
    }
    return;
  }
  private static int gscan(int[] ansx, int[] ansy, int num){
    int s1x, s1y, s2x, s2y;
    for(;num > 0;){
      if(num == 1)return ++num;
      s1x = ansx[num - 1] - ansx[num];
      s1y = ansy[num - 1] - ansy[num];
      s2x = ansx[num - 2] - ansx[num];
      s2y = ansy[num - 2] - ansy[num];
      if(s1x * s2y - s2x * s1y > 0){
        ansx[num - 1] = ansx[num];
        ansy[num - 1] = ansy[num];
        num--;
//        num = gscan(ansx, ansy, num);
      }else{
        num++;
        return num;
      }
    }
    return num;
  }
}