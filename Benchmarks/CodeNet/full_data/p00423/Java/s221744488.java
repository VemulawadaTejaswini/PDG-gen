public class Main{
  public void run(java.io.InputStream in,java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, i, x, y, suma, sumb;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;

      suma = 0;
      sumb = 0;

      for(i = 0;i < n;++i){
        x = sc.nextInt();
        y = sc.nextInt();
        if(x > y){
          suma += x + y;
        }else if(x < y){
          sumb += x + y;
        }else{
          suma += x;
          sumb += y;
        }
      }
      System.out.println(suma + " " + sumb);
    }

/*end*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}