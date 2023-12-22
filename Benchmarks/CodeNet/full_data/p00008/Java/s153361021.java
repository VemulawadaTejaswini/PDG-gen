public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int a, b, c, d, count;

    for(;sc.hasNext();){
      n = sc.nextInt();
      count = 0;
      for(a = 0;a < 10;a++){
        for(b = 0;b < 10;b++){
          for(c = 0;c < 10;c++){
            d = n - a - b - c;
            if(d >= 0 && d <= 9)count++;
          }
        }
      }
      System.out.println(count);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}