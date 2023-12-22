public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, i, max, min, sum, a;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      sum = 0;max = 0;min = 1000;
      for(i = 0;i < n;i++){
        a = sc.nextInt();
        if(min > a)min = a;
        if(max < a)max = a;
        sum += a;
      }
      out.println((sum - max - min) / (n - 2));
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}