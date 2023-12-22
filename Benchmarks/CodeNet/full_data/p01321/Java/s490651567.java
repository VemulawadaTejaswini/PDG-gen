public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, i, j, max, min, sum, a;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;

      max = 0;
      min = 500;
      for(i = 0;i < n;i++){
        sum = 0;
        for(j = 0;j < 5;j++){
          a = sc.nextInt();
          sum += a;
        }
        if(max < sum)max = sum;
        if(min > sum)min = sum;
      }
      System.out.println(max + " " + min);
    }
/*end*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}