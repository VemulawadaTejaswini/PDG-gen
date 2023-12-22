import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n;
    n = Integer.parseInt(br.readLine());
    String[] str1 = br.readLine().split(" ");
    String[] str2 = br.readLine().split(" ");
    int[] x = new int[n];
    int[] y = new int[n];
    double sum_2 = 0;
    double sum_3 = 0;
    double dist_1 = 0;
    double dist_2 = 0;
    double dist_3 = 0;
    double dist_m = 0;
    for (int i = 0; i < n; i++){
      x[i] = Integer.parseInt(str1[i]);
      y[i] = Integer.parseInt(str2[i]);
    }

    // p = 1
    for (int i = 0; i < n; i++){
      dist_1 += Math.abs(x[i]-y[i]);
    }
    // p = 2
    for (int i = 0; i < n; i++){
      sum_2 += Math.abs((x[i]-y[i])*(x[i]-y[i]));
    }
    dist_2 = Math.sqrt(sum_2);
    //p = 3
    for (int i = 0; i < n; i++){
      sum_3 += Math.abs(Math.pow((x[i]-y[i]),3));
    }
    dist_3 = Math.cbrt(sum_3);
    //p = ∞
    int max = x[0]-y[0];
    for (int i = 0; i < n; i++){
      if (x[i]-y[i] >= max)
        max = x[i]-y[i];
    }
    dist_m = max;
    System.out.println(dist_1);
    System.out.println(dist_2);
    System.out.println(dist_3);
    System.out.println(dist_m);

  }
}

