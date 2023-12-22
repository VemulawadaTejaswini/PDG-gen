public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, m, i, j, k, l, count;
    int[] w, h, pw, ph;

    for(;;){
      n = sc.nextInt(); m = sc.nextInt();
      if(n == 0 && m == 0)break;
      h = new int[n]; w = new int[m];

      for(i = 0;i < n;i++)h[i] = sc.nextInt();
      for(i = 0;i < m;i++)w[i] = sc.nextInt();

      pw = new int[m * (m + 1) / 2]; ph = new int[n * (n + 1) / 2];
      count = 0;
      for(i = 0;i < m;i++){
        pw[count++] = w[i];
        for(j = i + 1;j < m;j++){
          pw[count] = pw[count - 1] + w[j]; count++;
        }
      }
      count = 0;
      for(i = 0;i < n;i++){
        ph[count++] = h[i];
        for(j = i + 1;j < n;j++){
          ph[count] = ph[count - 1] + h[j]; count++;
        }
      }

      count = 0;
      for(i = 0;i < m * (m + 1) / 2;i++)
        for(j = 0;j < n * (n + 1) / 2;j++)
          if(pw[i] == ph[j])count++;
      out.println(count);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}