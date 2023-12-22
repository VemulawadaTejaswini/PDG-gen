public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int t, n, k;
    int i, j, l, joint, sum, tmp;
    int[] x;
    int[] d;

    x = new int[100000];
    d = new int[100000];

    t = sc.nextInt();
    for(i = 0;i < t;i++){
      n = sc.nextInt();
      k = sc.nextInt();

      if(n <= k){
        for(j = 0;j < n;j++){
          k = sc.nextInt();
        }
        System.out.println(0);
      }else{
        joint = n - k;
        sum = 0;

//input
        for(j = 0;j < n;j++){
          if(j > 0){
            x[j] = sc.nextInt();
            d[j - 1] = x[j] - x[j - 1]; //distance
          }else{
            x[j] = sc.nextInt();
          }
        }
        d[n] = -1;

//sort
        if(joint < 50000){
          for(j = 0;j < joint;j++){
            for(l = 0;l < (n - j - 1);l++){
              if(d[l] < d[l + 1]){
                tmp = d[l];
                d[l] = d[l + 1];
                d[l + 1] = tmp;
              }
            }
            sum += d[l - 1];
          }
        }else{
          joint = (n - 1) - joint;  //mean : disjoint
          for(j = 0;j < joint;j++){
            for(l = 0;l < (n - j - 1);l++){
              if(d[l] > d[l + 1]){
                tmp = d[l];
                d[l] = d[l + 1];
                d[l + 1] = tmp;
              }
            }
            sum += d[l - 1];
          }
          sum = x[n - 1] - x[0] - sum;
        }
//output
        System.out.println(sum);
      }
    }
/*end*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}